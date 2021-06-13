package queue;
class queue{
	private int arr[];
	final int DEFAULT = 10;
	int rear = 0;
	int front = 0;
	int size = 0;
	
	queue(){
		arr = new int[DEFAULT];
	}
	
	boolean isEmpty() {
		return getSize()==0;
	}
	int getSize() {
		return size;
	}
	void enqueue(int element) {
		if(rear == arr.length) {
			throw new RuntimeException("Stack out of bound");
		}
		if(getSize()==0) {
			front = 0;
		}
		rear++;
		size++;
		if(rear== arr.length) {
			rear=0;
		}
		arr[rear]= element;
	}
	int dequeue() {
		if(getSize()==0) {
			throw new RuntimeException("Stack out of bound");
		}
		int temp = arr[front];
		front++;
		if(front==arr.length) {
			front = 0;
		}
		size--;
		if(size==0) {
			front=rear=-1;
		}
		return temp;
	}
	void display() {
		System.out.println("****************"); 
		for(int i=front;i<=rear;i--) {
			 System.out.println(arr[i]);
		 }
	 }
}
public class queueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q = new queue();
		q.enqueue(5);
		q.enqueue(50);
		q.enqueue(500);
		q.enqueue(5000);
		q.display();
		//System.out.println("******************");
		q.dequeue();
		q.display();
		
	}

}
