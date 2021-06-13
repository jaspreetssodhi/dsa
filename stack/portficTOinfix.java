package stack;

import java.util.Stack;

public class portficTOinfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "abc*+d-";
		System.out.println("POSTFIX = "+exp);
		Stack<String> op = new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char word = exp.charAt(i);
			if(Character.isAlphabetic(word) || Character.isDigit(word)) {
				op.push(Character.toString(word));
			}
			else {
				String pop1 = op.pop();
				String pop2 = op.pop();
				String exp1 = pop2+Character.toString(word)+pop1;
				op.push(exp1);
			}
			
		}
			System.out.print("INFIX = "+op.pop());
	}

}
