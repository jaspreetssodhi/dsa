package trees;
import java.util.ArrayList;
import java.util.Scanner;

class Node{
	int data;
	ArrayList<Node> children;
	Node(int data){
		this.data = data;
		children = new ArrayList<Node>();
		//this.next = null;
	}
}
	
class GenericTreeOperation{
	Scanner sc = new Scanner(System.in);
	Node root;
	Node add() {
		Node root = null;
		System.out.println("Enter the parent data");
		int data = sc.nextInt();
		root = new Node(data);
		System.out.println("Enter number of children");
		int children = sc.nextInt();
		for(int i=0;i<children;i++) {
			Node child = add();
			root.children.add(child);
			}
		return root;
		}
	void print(Node root) {
		String str = root.data + "=>";
		for(int i=0;i<root.children.size();i++) {
			str += root.children.get(i).data+" , ";
		}
		System.out.println(str.substring(0,str.length()-2));
		for(int i=0;i<root.children.size();i++) {
			System.out.println(root.children.get(i));
		}
	}
	int countNodes(Node root){
		if(root == null) {
			return 0;
		}
		int count = 1;
		for(int i=0;i<root.children.size();i++) {
			count+=countNodes(root.children.get(i));
		}
		return count;
	}
	int largestNode(Node root) {
		if(root == null) {
			return 0;
		}
		int largest = root.data;
		for(int i=0;i<root.children.size();i++) {
			int currentNode = largestNode(root.children.get(i));
			if(currentNode>largest) {
				largest = currentNode;
			}
		}
		return largest;
	}
	int height(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		int max = 0;
		for(int i = 0;i<root.children.size();i++) {
			max = Math.max(max,height(root.children.get(i)));
		}
		return max;
	}
	int countLeafNodes(Node root) {
		int count =0;
		if(root ==null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		for(int i = 0;i<root.children.size();i++) {
			count+=countNodes(root.children.get(i));
		}
		return count;
	}

}
public class treeOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTreeOperation gt = new GenericTreeOperation();
		gt.root = gt.add();
		gt.print(gt.root);
		gt.countNodes(gt.root);
		gt.height(gt.root);
		gt.countLeafNodes(gt.root);
	}

}
