package stack;
import java.util.Stack;

public class stockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {100, 80, 60, 70, 60, 75, 85};
		int index[] = new int[prices.length];
		index[0]=1;
		Stack<Integer> p = new Stack<>();
		p.push(0);
		for(int i=1;i<prices.length;i++) {
			while(!p.isEmpty() && prices[i]>prices[p.peek()]) {
				p.pop(); 
			}
			index[i] = p.isEmpty()?(i+1):(i-p.peek());
			p.push(i);
		}
		for(int i:index) {
			System.out.println(i);
		}
	}

}
