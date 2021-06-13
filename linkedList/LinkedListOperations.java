package linkedList;
import java.util.Scanner;
import java.util.HashMap;

class Node<T>{
	T data;
	Node<T> next;
	//Node prev;
	Node(T data){
		this.data = data;
		//this.next = null;
	}
	
}
class LinkedListOperation<T>{
	Node<T> start;  // head
	Node<T> tail;
	public int getCount() 
    { 
        Node temp = start; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.next; 
        } 
        return count; 
    } 
	void addInLast(Node<T> node) {
		
		if(start == null) {
			start = tail = node;
		}
		else {
			tail.next  = node;
			tail = node;
		}
		/*else {
			Node<T> temp = start;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}*/
		
		
	}
	void addAtAnyPosition(int position, Node<T> node) {
		if(position==0 && start ==null) {
			start = tail = node;
			return ;
		}
		if(position==0) {
			node.next = start;
			start = node;
		}
		else {
			int i = 1;
			Node<T> temp = start;
			while(i<position) {
				temp = temp.next;
				i++;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}
	void addInFirst(Node<T> node) {
		if(start == null) {
			start = tail = node;
		}
		else {
			
			node.next = start;
			start = node;
			
		}
	}
	void print() {
		Node<T> temp = start;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	void kthElement(int k) {
		Node<T> fast = start;
		Node<T> slow = start;
		for(int i=1;i<=k;i++) {
			fast =  fast.next;
		}
		while(fast!=null) {
			fast=fast.next;
			slow=slow.next;
			
		}
		System.out.println(slow.data);
	}
	void detectloop() {
		Node<T> temp = null;
		temp = start;
		HashMap<Node<T>,Boolean> map = new HashMap<>();
		while(temp!=null) {
			if(map.get(temp)==null) {
				map.put(temp,true);
			}
			else {
				System.out.print("Loop Detected");
				return;
			}
			temp=temp.next;
		}
		System.out.println("No loop found");
		
		
	}
	 void reverse() {
		Node<T> current = start;
		Node<T> prev = null;
		Node<T> next = null;
		while(current!=null) {
			next=current.next;
			current.next = prev;
			prev =current;
			current=next;
		}
		start=prev;
	}
	 void reverseFromMid(Node<T> point) {
			Node<T> current = point;
			Node<T> prev = null;
			Node<T> next = null;
			while(current!=null) {
				next=current.next;
				current.next = prev;
				prev =current;
				current=next;
			}
			start=prev;
		}
	 	
	 void palindrome(int size) {
			Node<T> fast = start;
			Node<T> slow = start;
			for(int i=1;i<=size/2+1;i++) {
				fast =  fast.next;
			}
			System.out.println(fast.data);

			reverseFromMid(fast);
			//print();
			while(fast!=null) {
				if(slow.data!=fast.data) {
					//flag=1;
					System.out.println("Plindrome not found");
					break;
					}
				fast=fast.next;
				slow=slow.next;
				System.out.println("Plindrome found");
				}
				
				
			}
	 void intersection() {
		 
	 }
	
}
public class LinkedListOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Data Type of LinkedList");
		System.out.println("1. Integer");
		System.out.println("2. String");
		int choice = scanner.nextInt();
		if(choice ==1 ) {
			LinkedListOperation<Integer> opr = 
					new LinkedListOperation<>();
			while(true) {
				System.out.println("1. For Add in Last");
				System.out.println("2. For Print");
				System.out.println("3. For Add at First");
				System.out.println("4. Add at Any Position");
				//System.out.println("5. Search elemet at Kth Position from  last");
				int ch = scanner.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter the data to add");
					int data = scanner.nextInt();
					Node<Integer> node = new Node<>(data);
					opr.addInLast(node);
					break;
				case 2:
					opr.print();
					break;
				case 3:
					System.out.println("Enter the data to add");
					 data = scanner.nextInt();
					node = new Node<>(data);
					opr.addInFirst(node);
					break;
				case 4:
					System.out.println("Enter the Position");
					int pos = scanner.nextInt();
					System.out.println("Enter the data to add");
					 data = scanner.nextInt();
					node = new Node<>(data);
					opr.addAtAnyPosition(pos, node);
					break;
				case 5:
					System.out.println("Enter the Position");
					int k = scanner.nextInt();
					opr.kthElement(k);
				}
				
			}
		}
		else
		if(choice ==2 ) {
			LinkedListOperation<String> opr = 
					new LinkedListOperation<>();
		}
		
		
		
		// TODO Auto-generated method stub
		/*Object t = 100;
		Object r = "Hello";
		t = new Integer(100);
		t = new String("Hello");
		t = new Double(90.20);
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		//Object g= l.get(0);
		int g = l.get(0);
		System.out.println(l.get(0) + l.get(1));
		Node<Integer> node = new Node<>(10);
		Node<Integer> node2 = new Node<>(20);
		node.next = node2;*/
		

	}

}
