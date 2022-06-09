package queue;

public class Driver {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(43);
		queue.enqueue(4332);
		queue.enqueue(65);
		
		queue.dequeue();
		queue.peek();
		
		
		queue.print();
		
		
		
		
	}
}
