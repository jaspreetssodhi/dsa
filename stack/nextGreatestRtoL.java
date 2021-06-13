package stack;

import java.util.Stack;

public class nextGreatestRtoL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {41,25,2,5};
		Stack<Integer> s = new Stack<>();
		for(int ele = arr.length-1;ele>=0;ele--) {
			while(!s.isEmpty() && arr[ele]>s.peek()) {
					int top = s.pop();
					System.out.println(top + " " + arr[ele] );
				}
			s.push(arr[ele]);
		}
			while(!s.empty()) {
				System.out.println(s.pop() + " -1");
				}
	}

}
