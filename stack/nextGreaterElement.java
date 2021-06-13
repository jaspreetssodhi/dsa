package stack;
import java.util.Stack;

public class nextGreaterElement {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,2,25};
		Stack<Integer> s = new Stack<>();
		for(int ele : arr) {
			while(!s.isEmpty() && ele>s.peek()) {
					int top = s.pop();
					System.out.println(top + " " + ele );
				}
			s.push(ele);
		}
			while(!s.empty()) {
				System.out.println(s.pop() + " -1");
				}
		}
	

}
