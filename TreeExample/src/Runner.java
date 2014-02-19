
public class Runner {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.addNode(23, "I");
		tree.addNode(31, "J");
		tree.addNode(37, "K");
		tree.addNode(2, "A");
		tree.addNode(3, "B");
		tree.addNode(5, "C");
		tree.addNode(7, "D");
		tree.addNode(11, "E");
		tree.addNode(13, "F");
		tree.addNode(17, "G");
		tree.addNode(19, "H");
		tree.addNode(41, "L");
		
		System.out.println(tree);
		
		System.out.println(tree.inorderTraverse('k'));
		System.out.println(tree.preorderTraverse('k'));
		System.out.println(tree.postorderTraverse('k'));
		
		System.out.println(tree.inorderTraverse('v'));
		System.out.println(tree.preorderTraverse('v'));
		System.out.println(tree.postorderTraverse('v'));
		
		System.out.println(tree.inorderTraverse());
		System.out.println(tree.preorderTraverse());
		System.out.println(tree.postorderTraverse());
	}

}
