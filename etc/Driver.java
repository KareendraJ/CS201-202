package etc;

public class Driver {

	public static void main(String[] args) {
		A a = new A(19, 10.22);		// new 
		
		A b = a;
		
		b.setA(22);
		
		
//		a.a = 19;
//		a.f = 10.22;
		
		System.out.println(a.getA());
//		System.out.println(a.f);

	}

}
