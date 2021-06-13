package stack;

class Stack{
	private int arr[];
	private int top;
	final int DEFAULT = 10;
	
	Stack(){
		arr = new int[DEFAULT];
		top=-1;
	}
	int getsize() {
		return top+1;
	}
	boolean isEmpty() {
		return getsize()==0;
	}
	void push (int data) {
		if(getsize()==arr.length) {
			throw new RuntimeException("Stack out of bound");
		}
		top++;
		arr[top]=data;
	}
	int pop() {
		if(getsize()==0) {
			throw new RuntimeException("Stack is Empty");
		}
		int data = arr[top];
		arr[top]=0;
		top--;
		return data;
	}
	 int peak() {
		 if(getsize()==0) {
				throw new RuntimeException("Stack is Empty");
			}
		 return arr[top];
	 }
	 void display() {
		 for(int i=top;i>=0;i--) {
			 System.out.println(arr[i]);
		 }
	 }

}


public class Tdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(19);
		s.push(20);
		s.push(23);
		s.push(23);
		s.peak();
		System.out.println("*******************");
		s.display();
		s.pop();
		s.pop();
		System.out.println("AFTER POP");
		s.display();
		
	}

}
