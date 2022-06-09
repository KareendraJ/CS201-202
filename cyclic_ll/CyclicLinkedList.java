package cyclic_ll;

public class CyclicLinkedList {
	private Node head;
	private Node tail;
	
	public CyclicLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertHead(int data) {
		if(isEmpty()) {
			Node newNode = new Node(data);
			head = newNode;
			tail = newNode;
		}else {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		
		
		tail.next = head;
		
	}
	
	
	
	
	
	public void insertNext(int nextTo, int data) {
		// search for the node
		Node result = search(nextTo);
		
		if(result != null) {
			Node newNode = new Node(data);
			newNode.next = result.next;
			
			result.next = newNode;
			
			if(tail == result) {
				tail= newNode;
				
				
				tail.next = head;
				
			}
			
		}
		
	}
	
	public Node search(int data) {
		Node temp = head;
		
		while(temp != null) {
			if(temp.getData() == data) {
				return temp;
			}
			
			temp = temp.next;
		}
		
		return null;
	}
	
	
	
	
	
	public void insertTail(int data) {
		if(isEmpty()) {	// list is empty
			Node newNode = new Node(data);
			head = newNode;
			tail = newNode;
			
			tail.next = head;
			
		}else {
			Node newNode = new Node(data);
			tail.next = newNode;
			tail = newNode;
			
			tail.next = head;
		}		
	}
	
	
	
	
	
	
	
	
	
	public void delete(int data) {
		Node current = head;
		Node previous = head;
		
		while(current != null) {
			if(current.getData() == data) {
				if(current == head) {	// *************
					head = current.next;
					
					tail.next = head;
				}
				
				if(current == tail) {	// *************
					tail = previous;
					
					tail.next = head;
				}
				
				previous.next = current.next;
				
				current.next = null;	//************
				
				return;
			}
			
			previous = current;
			current = current.next;
		}
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		
		return false;
	}
	
	public void printList() {
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.getData());
			
			temp = temp.next;
			
			if(temp == head) {
				break;
			}
			
		}
	}

}
