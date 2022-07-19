package tree.stack;

import tree.dfs_bfs.TreeNode;

public class Stack {
	private Node top;
	
	public Stack() {
		this.top = null;
	}

	public void push(TreeNode data) { // insert head
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public Node pop() {
		if(isEmpty()) 
			return null;
		
		Node temp = top;
		
		top = top.next;
		
		temp.next = null;
		
		return temp;
	}
	
	
	public boolean isEmpty() {
		if (top == null) 
			return true;
		
		return false;
	}
	
	public TreeNode peek() {
		if(!isEmpty()) {
			return top.getData();
		}
		
		return null;
	}
	
	
	public void print() {
		Node temp = top;
		
		while(temp != null) {
			System.out.println(temp.getData());
			
			temp = temp.next;
		}
	}
	
}
