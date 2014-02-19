
public class BinaryTree {
	BinaryNode<Integer, String> root;
	
	public void addNode(int key, String value) {
		BinaryNode<Integer, String> newNode = new BinaryNode<Integer, String>(key, value);
		if (this.root == null) {
			root = newNode;
		} else {
			BinaryNode<Integer, String> focusNode = root;
			BinaryNode<Integer, String> parent;
			int i = 0;
			while (true) {
				parent = focusNode;
				if (key < focusNode.getKey()) {
					focusNode = focusNode.getLeft();
					if (focusNode == null) {
						parent.setLeft(newNode);
						return;
					}
				} else {
					focusNode = focusNode.getRight();
					if(focusNode == null) {
						parent.setRight(newNode);
						return;
					}
				}
			}
		}
	}
	
	/**
	 * Traverse the tree and retern a string of the traverse
	 * @param focusNode
	 * @return String with the tree traversed by inorder
	 */
	public String inorderTraverse(BinaryNode<Integer, String> focusNode) {
		String x = "";
		if (focusNode.getLeft() != null) inorderTraverse(focusNode.getLeft());
		x += focusNode;
		if (focusNode.getRight() != null) inorderTraverse(focusNode.getRight());
		return x;
	}
	
	/**
	 * Overrides the toString() method
	 * Returns the tree inorder by default
	 */
	@Override public String toString() {
		return inorderTraverse(root);
	}
	
	
}
