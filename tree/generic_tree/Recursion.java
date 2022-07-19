package tree.generic_tree;

public class Recursion {
	public static void main(String[] args) {
		Recursion r = new Recursion();
		
		r.a(10);
		
	}
	
	public void a(int i) {
		if(i < 0) {
			return;
		}
		
		a(i-1);
		
		System.out.println(i);
		
	}
	
	
}
