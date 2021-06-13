package stack;

import java.util.ArrayList;

public class reverseStack {
	static void reverse(Stack org, Stack dup, int index) {
		if(org.getsize()==0) {
			return;
		}
		int popValue = org.pop();
		reverse(org, dup, index+1);
		dup.push(popValue);
		if(index==0) {
			while(!dup.isEmpty()) {
				org.push(dup.pop());
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GStack<Integer> gs = new GStack<>();
		Stack gs = new Stack();
		gs.push(10);
		gs.push(30);
		gs.push(40);
		gs.push(23);
		reverse(gs, new Stack(), 0);
	}

}
