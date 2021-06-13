package stack;

import java.util.Stack;

public class infixTOprefix {
	static String reverseString(String str) {
		if(str.length()==1) {
			return String.valueOf(str.charAt(0));
		}
		return(reverseString(str.substring(1))) + str.charAt(0);
	}
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
			String result = " ";
			String exp = reverseString("a+b*c-d");
			System.out.println("INFIX = "+exp);
			
			 Stack<Character> op = new Stack<>();
			 for(int i=0;i<exp.length();i++) {
				char word = exp.charAt(i);
				if(Character.isAlphabetic(word) || Character.isDigit(word)) {
					result +=(Character.toString(word));
					//System.out.print(word);
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
								result +=(Character.toString(topelement));
								//System.out.print(topelement);
								topelement = op.pop();
								}
							result +=(Character.toString(topelement));
							//System.out.print(topelement);
							op.push(word);
						}
					}
				}
			 }
			 result +=(Character.toString(op.pop()));
			 //System.out.print(op.pop());
			 System.out.print("PREFIX = "+reverseString(result));
		}

}
