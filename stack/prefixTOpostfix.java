package stack;

import java.util.Stack;

public class prefixTOpostfix {
	static int checkPrecedence(char ch) {
		if(ch=='+'||ch=='-') {
			return 1;
		}
		if(ch=='*'||ch=='/') {
			return 2;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "+a-*bcd";
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
			String infixRes = op.pop();
			System.out.println("PREFIX = "+exp);
			System.out.println("INFIX = "+infixRes);
			System.out.print("POSTFIX = ");
			String exp1 = infixRes;
			 Stack<Character> op1 = new Stack<>();
			 for(int i=0;i<exp1.length();i++) {
				char word = exp1.charAt(i);
				if(Character.isAlphabetic(word) || Character.isDigit(word)) {
					System.out.print(word);
				}
				else {
					if(op1.isEmpty()) {
						op1.push(word);
					}
					else{
						char topelement = op1.peek();
						if(checkPrecedence(word)>checkPrecedence(topelement)) {
							op1.push(word);
						}
						else {
							topelement = op1.pop();
							while(!op.isEmpty() && (checkPrecedence(topelement)>=checkPrecedence(word))){
								System.out.print(topelement);
								topelement = op1.pop();
								}
							System.out.print(topelement);
							op1.push(word);
						}
					}
				}
			 }
			 System.out.print(op1.pop());
	}

}
