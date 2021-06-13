package stack;
import java.util.ArrayList;

class GStack<T>{
	private ArrayList<T> arr =  new ArrayList<>();
	private int top;
	final int DEFAULT = 10;
	int capacity = DEFAULT;
	
	GStack(){
		arr = new ArrayList<>(DEFAULT);
		top=-1;
	}
	GStack(int capacity){
		this.capacity = capacity;
		arr = new ArrayList<>(capacity);
		top = -1;
	}
	int getsize() {
		return top+1;
	}
	
	boolean isEmpty() {
		return getsize()==0;
	}
	void push (T data) {
		if(getsize()==capacity) {
			throw new RuntimeException("Stack out of bound");
		}
		top++;
		arr.add(data);
		//arr[top]=data;
	}
	T pop() {
		if(getsize()==0) {
			throw new RuntimeException("Stack is Empty");
		}
		T data = arr.get(top);
		arr.set(top,null);
		top--;
		return data;
	}
	 T peek() {
		 if(getsize()==0) {
				throw new RuntimeException("Stack is Empty");
			}
		 return arr.get(top);
	 }
	 void display() {
		 for(int i=top;i>=0;i--) {
			 System.out.println(arr.get(i));
		 }
	 }

}

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stack = new GStack<>();
		stack.push("ram");
		stack.push("shyam");
		stack.push("tim");
		stack.push("kim");
		System.out.println(stack.peek());
		System.out.println("********************");
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();
	}

}
