package doubly_linked_list;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	
	// insert
	public void insertTail(int data) {
		if(isEmpty()) {	// list is empty
			Node newNode = new Node(data);
			head = newNode;
			tail = newNode;
			
			
		}else {
			Node newNode = new Node(data);
			
			tail.next = newNode;
			newNode.previous = tail;
			
			tail = newNode;
			
		}		
	}
	
	public void insertHead(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			
		}else {
			newNode.next = head;
			head.previous = newNode;
			
			head = newNode;
		}
		
	}
	
	public void insertNext(int nextTo, int data) {
		Node result = search(nextTo);
		
		if(result == null) {
			//.....
		} else {
			Node newNode = new Node(data);
			
			
			newNode.next = result.next;
			result.next.previous = newNode;
			
			result.next = newNode;
			newNode.previous = result;
			
			if(result == tail) {
				tail = newNode;
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
	
	public Node reverseSearch(int data) {
		Node temp = tail;
		
		while(temp != null) {
			if(temp.getData() == data) {
				return temp;
			}
			
			temp = temp.previous;
		}
		
		return null;
	}
	
	public void delete(int data) {
		Node result = search(data);
		
		if(result != null) {
			
			if(	result == head) {
				head = result.next;
				result.next.previous = null;
			}else if(result == tail) {
				tail = tail.previous;
//				result.previous.next = null;
				tail.next = null;
				
			}else {
				result.previous.next = result.next;
				result.next.previous = result.previous;
			}
			
			
			
			result.next = null;
			result.previous = null;
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
		}
	}
	
	public void printReverse() {
		Node temp = tail;
		
		while(temp != null) {
			System.out.println(temp.getData());
			
			temp = temp.previous;
		}
	}
	
}

