import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
		BinaryTree<String, Integer> tree = new BinaryTree<String, Integer>();
		ArrayList<BinaryNode<Integer, Character>> nodes = new ArrayList<BinaryNode<Integer, Character>>();
		
		nodes.add(new BinaryNode<Integer, Character>(50, 'A'));
		nodes.add(new BinaryNode<Integer, Character>(35, 'T'));
		nodes.add(new BinaryNode<Integer, Character>(10, 'C'));
		nodes.add(new BinaryNode<Integer, Character>(5, 'G'));
		
	}
	
	public static BinaryTree<Integer, Character> buildHuffmanTree(ArrayList<BinaryNode<Integer, Character>> ns) {
		ArrayList<BinaryTree<Integer, Character>> parts = new ArrayList<BinaryTree<Integer, Character>>();
		ArrayList<BinaryNode<Integer, Character>> nsCopy = new ArrayList<BinaryNode<Integer, Character>>(ns);
		ArrayList<BinaryNode<Integer, Character>> result = new ArrayList<BinaryNode<Integer, Character>>();
		int current = 0;
		
		while (result.size() < nsCopy.size()) {
			if (result.isEmpty()) {
				result.add(nsCopy.get(0));
				nsCopy.remove(0);
				current++;
			} else {
				for (int i = 0; i < )
				if (result.get(current) < nsCopy.0) {
					
				}
			}
		}
		
	}
}