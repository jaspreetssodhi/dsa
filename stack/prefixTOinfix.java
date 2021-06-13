package stack;
import java.util.Stack;

public class prefixTOinfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "+a-*bcd";
		System.out.println("PREFIX = "+exp);
		Stack<String> op = new Stack<>();
		for(int i=exp.length()-1;i>=0;i--) {
			char word = exp.charAt(i);
			if(Character.isAlphabetic(word) || Character.isDigit(word)) {
				op.push(Character.toString(word));
			}
			else {
				String pop1 = op.pop();
				String pop2 = op.pop();
				String exp1 = pop1+Character.toString(word)+pop2;
				op.push(exp1);
			}
			
		}
			System.out.print("INFIX = "+op.pop());
			
	}

}
