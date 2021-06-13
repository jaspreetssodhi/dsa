package trees;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class BNode{
	int data;
	BNode left;
	BNode right;
	BNode(int data){
		this.data = data;
	}
}
class BinaryTreeOperations{
	Scanner s = new Scanner(System.in);
	String str = "root";
	BNode add() {
		System.out.println("Enter the "+str+" Data Press -1 to Exit");
		int data = s.nextInt();
		if(data==-1) {
			return null;
		}
		BNode node = new BNode(data);
		str = "left";
		node.left = add();
		str = "right";
		node.right = add();
		str = "root";
		return node;
	}
	void print(BNode root) {
		if(root == null) {
			return ;
		}
		String str = root.data+" => ";
		if(root.left!=null) {
			str += "L:"+root.left.data;
		}
		if(root.right!=null) {
			str+="R:"+root.right.data;
		}
		System.out.println(str);
		print(root.left);
		print(root.right);
	}
	
	void preOrder(BNode root) {
		if(root == null) {
			return ;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	void postOrder(BNode root) {
		if(root == null) {
			return ;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	void inOrder(BNode root) {
		if(root == null) {
			return ;
		}
		
		postOrder(root.left);
		System.out.println(root.data);
		postOrder(root.right);
		
	}
	
	int countNodes(BNode root) {
		if(root == null) {
			return 0;
		}
		int counter = 1;
		counter+=countNodes(root.left);
		counter+=countNodes(root.right);
		return counter;
	}
	int height(BNode root) {
		if(root ==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int max = Math.max(leftHeight, rightHeight);
		return max+1;
		
	}
	int diameter(BNode root) {
		if(root == null) {
			return 0;
		}
		int total = height(root.left) + height(root.right) + 1;
		int leftTotal = diameter(root.left);
		int rightTotal = diameter(root.right);
		return Math.max(total, Math.max(leftTotal, rightTotal));
		
	}
	
	void levelOrder(BNode root) {
		LinkedList<BNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BNode currentNode = queue.removeFirst();
			System.out.println(currentNode.data);
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
	}
	boolean printAncestors(BNode root, int searchValue) {
		if(root == null) {
			return false;
		}
		if(root.data== searchValue) {
			return true;
		}
		if(printAncestors(root.left, searchValue)||
		printAncestors(root.right, searchValue)) {
			System.out.println(root.data);
			return true;
		}
		return false;
	}
	BNode mirror(BNode root) {
		if(root == null) {
			return root;
		}
		BNode left = mirror(root.left);
		BNode right = mirror(root.right);
		root.left = right;
		root.right = left;
		return root;
	}
	void spiral(BNode root) {
		Stack<BNode> oddStack = new Stack<>();
		Stack<BNode> evenStack = new Stack<>();
		oddStack.push(root);
		while(!oddStack.isEmpty() || !evenStack.isEmpty()) {
		while(!oddStack.isEmpty() ) {
			BNode current = oddStack.pop();
			System.out.println(current.data);
			if(current.right!=null) {
				evenStack.push(current.right);
			}
			if(current.left!=null) {
				evenStack.push(current.left);
			}
		}
		while(!evenStack.isEmpty() ) {
			BNode current = evenStack.pop();
			System.out.println(current.data);
			if(current.left!=null) {
				oddStack.push(current.left);
			}
			if(current.right!=null) {
				oddStack.push(current.right);
			}
			
		}
		}
		
	}
}
public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperations opr = new BinaryTreeOperations();
		BNode root = opr.add();
		opr.print(root);
		System.out.println(opr.height(root));
		opr.levelOrder(root);
		System.out.println(opr.countNodes(root));
		System.out.println("Diameter "+opr.diameter(root));

	}

}