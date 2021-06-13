package linkedList;
import java.util.LinkedList;
import java.util.Iterator;
import linkedList.LinkedListOperations;

public class add2numbers {
	static void add (Node<Integer> first, Node<Integer> second) {
		//Node<Integer> list;
		/*while(first.next!= null) {
			System.out.println(first.next.data);
			
		}
		System.out.println("**********");
		while(second.next!= null) {
			
			System.out.println(second.next.data);
		}
		System.out.println("****************");*/
		int carry =0;
		LinkedList<Integer> list=new LinkedList<Integer>();
		while(first.next !=  null || second.next != null) {
			int sum = first.data+second.data+carry;
			list.addFirst(sum%10);
			carry = sum/10;
			first = first.next;
			second = second.next;
		}
		if(carry!=0) {
			list.addFirst(carry);
		}
		Iterator<Integer> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.print(iterator.next());
	     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperation<Integer> opr1 = new LinkedListOperation<>();
		LinkedListOperation<Integer> opr2 = new LinkedListOperation<>();
		
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		Node<Integer> node4 = new Node<>(4);
		Node<Integer> node5 = new Node<>(5);
		Node<Integer> node6 = new Node<>(6);
		
		opr1.addInLast(node1);
		opr1.addInLast(node2);
		opr1.addInLast(node3);
		opr1.addInLast(node4);
		opr1.addInLast(node5);
		opr1.addInLast(node6);
		
		opr2.addInLast(node1);
		opr2.addInLast(node2);
		opr2.addInLast(node3);
		opr2.addInLast(node4);
		opr2.addInLast(node5);
		opr2.addInLast(node6);
		
		opr1.reverse();
		opr1.print();
		System.out.println("*********");
		opr2.reverse();
		opr2.print();
		
		
		//add(opr1.start,opr2.start);
	}

}
