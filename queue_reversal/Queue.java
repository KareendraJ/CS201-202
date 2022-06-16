package queue_reversal;

public class Queue {
	private Node front;
	private Node rear;
	
	public Queue() {
		this.front = null;
		this.rear = null;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	
	public void enqueue(Node newNode) {
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
		if(isEmpty()) {
			System.out.println("Empty Queue!!");
			return;
		}
		
		Node temp = front;
		
		while(temp != null) {
			System.out.println(temp.getData());
			
			temp = temp.next;
		}
		
	}
	
	public Queue reverse() {
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		
		
		while(!isEmpty()) {
			q2.enqueue( dequeue() );
			
			while(!q1.isEmpty()) {
				q2.enqueue(q1.dequeue());
			}
			
			Queue temp = q1;
			q1 = q2;
			q2 = temp;
		}
		
		
		return q1;
		
	}
	
}
