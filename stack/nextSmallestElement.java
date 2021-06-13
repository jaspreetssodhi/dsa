package stack;
import java.util.Stack;

public class nextSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,1,3,5,2,7,};
		Stack<Integer> s = new Stack<>();
		
		for(int ele: arr) {
			while(!s.isEmpty() && ele<s.peek()) {
				int popElement  = s.pop();
				System.out.println(popElement +" "+ ele);
			}
			s.push(ele);
		}
		while(!s.isEmpty()) {
			System.out.println(s.peek()+" -1");
			s.pop();
		}
	}

}
