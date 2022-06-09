package stack;

public class Driver {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(456);
		stack.push(90);
		stack.push(345);
		stack.push(324);
		stack.push(32);
		
		stack.pop();
		
		stack.print();
		
		System.out.println("\n" + stack.peek());
		
	}

}
