package linkedList;
import linkedList.LinkedListOperations;

public class splitAlternate {
	static Node<Integer> split(Node<Integer> start) {
		Node<Integer> start2  = start;
		Node<Integer> temp , temp2;
		
		if(start == null) {
			return start;
		}
		
		if(start.next == null) {
			return start;
		}
		temp = start;
		start2 = temp2 = start.next;
		while(temp.next != null && temp.next.next != null) {
			temp.next = temp.next.next;
			temp2.next = temp2.next.next;
			temp = temp.next;
			temp2 = temp2.next;
		}
		if(temp.next!=null) 
			temp.next = null;
		return start2;
	}
	static void print(Node<Integer> start) {
		Node<Integer> temp = start;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		LinkedListOperation<Integer> opr = new LinkedListOperation<>();
		for(int i = 1; i<=6; i++) {
			Node<Integer> node = new Node<>(i);
			opr.addInLast(node);
		}
		Node<Integer> start2 = split(opr.start);
		System.out.println("After Split....");
		print(opr.start);
		print(start2);
	}
}
