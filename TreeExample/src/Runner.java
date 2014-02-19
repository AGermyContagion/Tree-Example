
public class Runner {

	public static void main(String[] args) {
		BinaryTree<String, Integer> tree = new BinaryTree<String, Integer>();
		//long startTime;
		//long endTime;
		
		tree.addNode("A", 15);
		tree.addNode("B", 20);
		tree.addNode("C", 25);
		tree.addNode("D", 18);
		tree.addNode("E", 16);
		tree.addNode("F", 5);
		tree.addNode("E", 16);
		tree.addNode("G", 7);
		tree.addNode("G", 7);
		
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