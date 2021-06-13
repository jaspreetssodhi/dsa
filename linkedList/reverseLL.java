package linkedList;
import linkedList.LinkedListOperations;
public class reverseLL<T> {
	Node<T> start;
	Node<T> end;
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
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperation<Integer> opr = new LinkedListOperation<>();
		
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		opr.addInLast(node1);
		opr.addInLast(node2);
		opr.addInLast(node3);
		opr.print();
		System.out.println("******************");
		opr.reverse();
		opr.print();
		
		
	}

}
