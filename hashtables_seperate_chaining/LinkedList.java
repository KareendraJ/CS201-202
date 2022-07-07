package hashtables_seperate_chaining;

public class LinkedList {
	private Node head;
	private Node tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void insert(int data) {
		if(isEmpty()) {
			Node newNode = new Node(data);
			head = newNode;
			tail = newNode;
		}else {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		
		// C. Obj
		// obj->next = head
		// change head
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
	
	public void delete(int data) {
		Node current = head;
		Node previous = head;
		
		while(current != null) {
			if(current.getData() == data) {
				if(current == head) {	// *************
					head = current.next;
				}
				
				if(current == tail) {	// *************
					tail = previous;
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
			System.out.print(temp.getData() + " ");
			
			temp = temp.next;
		}
		
		System.out.println();
	}
	
}
