package stack_reversal;

public class Driver {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(456);
		stack.push(90);
		stack.push(345);
		stack.push(324);
		stack.push(32);
		
		stack.print();
		
//		Stack rStack = stack.reverse();
		
		
		stack = stack.reverse();
		
		System.out.println();
		stack.print();
		
		
		
		
		
		
		
		
	}

}
