package linkedList;
import linkedList.LinkedListOperations;
public class palindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperation<Integer> opr = new LinkedListOperation<>();
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(0);
		Node<Integer> node3 = new Node<>(1);
		Node<Integer> node4 = new Node<>(0);
		Node<Integer> node5 = new Node<>(1);
		opr.addInLast(node1);
		opr.addInLast(node2);
		opr.addInLast(node3);
		opr.addInLast(node4);
		opr.addInLast(node5);
		opr.print();
		System.out.println("******************");
		int count = opr.getCount();
		opr.palindrome(count);
		//opr.print();
	}

}
