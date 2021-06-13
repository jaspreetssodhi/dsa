package stack;

import java.util.Stack;

public class nextSmallestRtoL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,1,3,5,2,7,};
		Stack<Integer> s = new Stack<>();
		
		for(int  ele = arr.length-1;ele>=0;ele--) {
			while(!s.isEmpty() && arr[ele]<s.peek()) {
				int popElement  = s.pop();
				System.out.println(popElement +" "+ arr[ele]);
			}
			s.push(arr[ele]);
		}
		while(!s.isEmpty()) {
			System.out.println(s.peek()+" -1");
			s.pop();
		}
	}

}
