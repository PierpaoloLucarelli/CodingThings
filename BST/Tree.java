import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

	class Node{


		public Node left;
		public Node right;
		public int val;

		public Node(int val){
			this.val = val;
			left = null;
			right = null;
		}
	}


public class Tree{

	Node[] ancestors = new Node[20];

	public Node root;

	public Tree(Node root){
		this.root = root;
		List<Node> ancestors = new ArrayList<>();
	}

	public int closestLeaf(Node node, int target, int index){

		if(node == null)
			return Integer.MAX_VALUE;

		if(node.val == target){

			int down =  closestDown(node);

			// System.out.println("Found down of : "  + node.val +" "  + down);
			// System.out.println("Ancestors");
			// System.out.println(Arrays.toString(ancestors));

			for(int i = index-1 ; i >= 0 ; i--){
				int temp = index -1 + closestDown(ancestors[i]);
				if( temp < down){
					down = temp;
				}
			}
			return down;


		}

		ancestors[index] = node;
		return Math.min(closestLeaf(node.left, target, index+1),closestLeaf(node.right, target, index+1));

	}

	public int closestDown(Node node){
		if(node == null)
			return Integer.MAX_VALUE;
		if(node.left == null && node.right == null)
			return 0;

		return 1+ Math.min(closestDown(node.left), closestDown(node.right));
	}



	public static void main(String[] args){

		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(6);

		Node left = new Node(20);
		Node right = new Node(21);

		root.left.left = left;
		// root.left.right = right;


		// root.right.right = new Node(8);

		left.left = new Node(30);
		left.left.left = new Node(40);

		Tree t = new Tree(root);

		Node target = root.left;
		System.out.println("closest Down of : " +target.val+ ": " +   t.closestDown(target));

		System.out.println("closest Leaf  of : " +target.val+ ": " +   t.closestLeaf(t.root, target.val, 0));



	}

}


