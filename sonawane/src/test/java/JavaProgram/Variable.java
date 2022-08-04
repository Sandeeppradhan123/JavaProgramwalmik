package JavaProgram;

public class Variable {

	static int a = 1;
	int b = 2;
	
	static final int c = 3;
	final int d = 4;

	public static void main(String[] args) {
		Variable obj = new Variable();

		System.out.println(a);
		a=11;
		System.out.println(a);
		
		System.out.println(obj.b);
		obj.b=22;
		System.out.println(obj.b);
		
		System.out.println(c);
//		c=33;  not possible bz final
		
		System.out.println(obj.d);
//		obj.d=44;  not possible bz final
		
		
	}
}
