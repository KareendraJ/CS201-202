package hashtables_seperate_chaining;

public class Node {
	private int data;
	protected Node next; 	// reference variable
	
	// public, protected, default, private
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
}
