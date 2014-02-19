
public class BinaryNode<Key extends Comparable<Key>, V extends Comparable<V>> {
	private Key key;
	private V value;
	private BinaryNode<Key, V> left;
	private BinaryNode<Key, V> right;
	
	@Override public String toString() { return "(k:" + this.key + " v:" + this.value + " {l: " + this.left + " r: " + this.right + "})"; }
	
	public BinaryNode(Key k, V value) {
		this.key = k;
		this.value = value;
		this.left = this.right = null;
	}
	
	public void setKey(Key k) { this.key = k; }
	
	public Key getKey() { return this.key; }
	
	public void setValue(V value) { this.value = value; }
	
	public V getValue() { return this.value; }
	
	public boolean isLeaf() {
		if ((this.left == null) && (this.right == null)) return true;
		else return false;
	}
	
	public void setLeft(BinaryNode<Key, V> left) { this.left = left; }
	
	public BinaryNode<Key, V> getLeft() { return this.left; }
	
	public boolean hasLeft() {
		if (this.left == null) return false;
		else return true;
	}
	
	public void removeLeft() { this.left = null; }
	
	public void setRight(BinaryNode<Key, V> right) { this.right = right; }
	
	public BinaryNode<Key, V> getRight() { return this.right; }
	
	public boolean hasRight() {
		if (this.right == null) return false;
		else return true;
	}
	
	public void removeRight() { this.right = null; }
}