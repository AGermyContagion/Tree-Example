
public class BinaryTree {
	BinaryNode<Integer, String> root;
	
	public void addNode(int key, String value) {
		BinaryNode<Integer, String> newNode = new BinaryNode<Integer, String>(key, value);
		if (this.root == null) {
			root = newNode;
		} else {
			BinaryNode<Integer, String> focusNode = root;
			BinaryNode<Integer, String> parent;
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
	
	public String inorderTraverse() {
		return inorderTraverse(root, 'b');
	}
	
	/**
	 * Traverse the tree and retern a string of the traverse
	 * @param focusNode
	 * @return String with the tree traversed by inorder
	 */
	public String inorderTraverse(BinaryNode<Integer, String> focusNode, char output) {
		String result = "";
		if (focusNode.getLeft() != null) result += inorderTraverse(focusNode.getLeft(), output);
		
		if (output == 'k') result += focusNode.getKey();
		else if (output == 'v') result += focusNode.getValue();
		else result += ("(" + focusNode.getKey() + ":" + focusNode.getValue() + ")");
		
		if (focusNode.getRight() != null) result += inorderTraverse(focusNode.getRight(), output);
		return result;
	}
	
	public String preorderTraverse() {
		return preorderTraverse(root, 'b');
	}
	
	public String preorderTraverse(BinaryNode<Integer, String> focusNode, char output) {
		String result = "";
		if (output == 'k') result += focusNode.getKey();
		else if (output == 'v') result += focusNode.getValue();
		else result += ("(" + focusNode.getKey() + ":" + focusNode.getValue() + ")");
		
		if (focusNode.getLeft() != null)  result += preorderTraverse(focusNode.getLeft(), output);
		
		if (focusNode.getRight() != null) result += preorderTraverse(focusNode.getRight(), output);
		return result;
	}
	
	public String postorderTraverse() {
		return postorderTraverse(root, 'b');
	}
	
	public String postorderTraverse(BinaryNode<Integer, String> focusNode, char output) {
		String result = "";
		
		if (focusNode.getLeft() != null)  result += postorderTraverse(focusNode.getLeft(), output);
		
		if (focusNode.getRight() != null) result += postorderTraverse(focusNode.getRight(), output);
		
		if (output == 'k') result += focusNode.getKey();
		else if (output == 'v') result += focusNode.getValue();
		else result += ("(" + focusNode.getKey() + ":" + focusNode.getValue() + ")");
		return result;
	}
	
	/**
	 * Overrides the toString() method
	 * Returns the Binary Tree Structure as a String
	 */
	@Override public String toString() {
		return toStringHelper(root);
	}
	
	private String toStringHelper(BinaryNode<Integer, String> focusNode) {
		String result = "";
		result += focusNode;
		if (focusNode.getLeft() != null) toStringHelper(focusNode.getLeft());
		if (focusNode.getRight() != null) toStringHelper(focusNode.getRight());
		return result;
	}
	
}
