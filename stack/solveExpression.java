package stack;
import java.util.*;
import java.lang.*;

public class solveExpression {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "10+20*30-5";
		char[] tokens = exp.toCharArray();
		Stack values = new Stack();
		Stack ops = new Stack();
		
		for(int i: tokens) {
			if(i == ' ') {
				continue;				
			}
			else if (i>=0 || i<=9) {
				StringBuffer sb =  new StringBuffer();
				while(i<tokens.length && i>=0 && i<=9) {
					sb.append(i++);
					}
				values.push(Integer.parseInt(sb.toString()));
				}
			else if(i=='+' || i=='-' || i=='*' || i=='/' || i=='(' || i==')') {
				ops.push(i);
			}
		}
	}
		public static int result (int a,int b,char op ) {
			switch(op) 
			{
			case '+':
				return a+b;
				break;
			case '-':
				return a-b;
				break;
			case '*':
				return a*b;
				break;
			case '/':
				return a/b;
				break;
			}
			return 0;
		}
		
		
	}

}
