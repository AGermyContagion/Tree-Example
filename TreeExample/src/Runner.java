
public class Runner {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.addNode(15, "A");
		tree.addNode(20, "B");
		tree.addNode(25, "C");
		tree.addNode(18, "D");
		tree.addNode(16, "E");
		tree.addNode(5, "F");
		tree.addNode(7, "G");
		
		System.out.println(tree);
		System.out.println(tree.getNumberOfNodes());
		
		System.out.println(tree.inorderTraverse('k'));
		System.out.println(tree.preorderTraverse('k'));
		System.out.println(tree.postorderTraverse('k'));
		
		System.out.println(tree.inorderTraverse('v'));
		System.out.println(tree.preorderTraverse('v'));
		System.out.println(tree.postorderTraverse('v'));
		
		System.out.println(tree.inorderTraverse());
		System.out.println(tree.preorderTraverse());
		System.out.println(tree.postorderTraverse());
		tree.clearTree();
		System.out.println(tree);
	}
}