package linkedList;

import java.util.HashMap;
import java.util.Scanner;
import linkedList.LinkedListOperations;

public class kthEndNode{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListOperation<Integer> opr = new LinkedListOperation<>();
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		opr.addInLast(node1);
		opr.addInLast(node2);
		opr.addInLast(node3);
		opr.print();
		System.out.println("******************");
		opr.kthElement(2);
		
	}
}
