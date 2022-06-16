package queue_reversal;

public class Node {
	private int data;
	protected Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
