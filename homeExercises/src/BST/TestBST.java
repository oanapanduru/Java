package BST;

public class TestBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BinaryTree tree = new BinaryTree();
	        Node root = null;
	        root = tree.insert(root, 4);
	        tree.insert(root, 2);
	        tree.insert(root, 1);
	        tree.insert(root, 3);
	        tree.insert(root, 6);
	        tree.insert(root, 5);
	        tree.insert(root, 0);
	 
	        System.out.println("Minimum value " + tree.findMin(root));
	    }
	}


