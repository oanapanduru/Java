package BST;

public class BinaryTree {
	static Node head;

	Node insert(Node node, int data) {
		if (node == null) {
			return (new Node(data));
		} else {
			if (data <= node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
			return node;
		}
	}

	int findMin(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}
		return (current.data);
	}
}
