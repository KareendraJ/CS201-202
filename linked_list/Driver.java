package linked_list;

public class Driver {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insertTail(199);
		l.insertTail(100);
		l.insertTail(324);
		
		
		l.insertHead(999);
		
		l.insertNext(100, 45);
		
		l.delete(324);
		
		l.insertTail(333);
		
		
		l.printList();
	}

}
