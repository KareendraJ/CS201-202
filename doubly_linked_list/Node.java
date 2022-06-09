package doubly_linked_list;

public class Node {
	private int data;
	protected Node next;
	protected Node previous;
	
	public Node(int data) {
		this.data = data;
		next = null;
		previous = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
}
