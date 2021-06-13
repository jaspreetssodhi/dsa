package linkedList;
import linkedList.LinkedListOperations;

public class detectLoop {

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
		opr.detectloop();

	}

}
