package stack;
import java.util.Stack;

public class infixTOpostfix {
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
		 String exp = "a+b*c-d";
		 System.out.println("INFIX = "+exp);
		 System.out.print("POSTFIX = ");
		 Stack<Character> op = new Stack<>();
		 for(int i=0;i<exp.length();i++) {
			char word = exp.charAt(i);
			if(Character.isAlphabetic(word) || Character.isDigit(word)) {
				System.out.print(word);
			}
			else {
				if(op.isEmpty()) {
					op.push(word);
				}
				else{
					char topelement = op.peek();
					if(checkPrecedence(word)>checkPrecedence(topelement)) {
						op.push(word);
					}
					else {
						topelement = op.pop();
						while(!op.isEmpty() && (checkPrecedence(topelement)>=checkPrecedence(word))){
							System.out.print(topelement);
							topelement = op.pop();
							}
						System.out.print(topelement);
						op.push(word);
					}
				}
			}
		 }
		 System.out.print(op.pop());
	}

}
