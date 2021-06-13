package trees;
import java.util.*;

class Bbnode {
	int data;
	Bbnode left;
	Bbnode right;
	Bbnode(int data){
		this.data = data;
	}
}
class Btreeopr{
	Scanner sc = new Scanner(System.in);
	Bbnode root;
	Bbnode add() {
		
		String str = "parent";
		System.out.println("Enter data at "+str+" Node and -1 to exit :");
		int data = sc.nextInt();
		if(data == -1) {
			return null;
		}
		Bbnode node = new Bbnode(data);
		str = "left";
		node.left = add();
		str = "right";
		node.right = add();
		return node;
	}
}
public class binaryTreeAdd {
	Btreeopr b = new Btreeopr();
	b.root = b.add();
}
