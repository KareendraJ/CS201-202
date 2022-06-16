package stack_reversal;

public class Stack {
	private Node top;
	
	public Stack() {
		this.top = null;
	}

	public void push(int data) { // insert head
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public void push(Node newNode) {
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
	
	public int peek() {
		if(!isEmpty()) {
			return top.getData();
		}
		
		return -1;
	}
	
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!");
			return;
		}
		
		Node temp = top;
		
		while(temp != null) {
			System.out.println(temp.getData());
			
			temp = temp.next;
		}
	}
	
	
	public Stack reverse() {
		Stack reverseStack = new Stack();
		
		while(!isEmpty()) {
//			Node temp = pop();
			
			reverseStack.push(pop());
			
		}
		
		return reverseStack;
		
	}
	
	
}
