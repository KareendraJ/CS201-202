package tree.queue;

import tree.dfs_bfs.TreeNode;

public class Queue {
	private Node front;
	private Node rear;
	
	public Queue() {
		this.front = null;
		this.rear = null;
	}
	
	public void enqueue(TreeNode data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	
	public Node dequeue() {
		if(!isEmpty()) {
			Node temp = front;
			
			front = front.next;
			
			temp.next = null;
			
			return temp;
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		
		return false;
	}

	public void peek() {
		if(!isEmpty()) {
			System.out.println("First in Line : " + front.getData());
		}
	}
	
	
	public void print() {
		Node temp = front;
		
		while(temp != null) {
			System.out.println(temp.getData());
			
			temp = temp.next;
		}
		
	}
}
