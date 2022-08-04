package JavaProgram;

public class Variable2 extends Variable {

	public static void main(String[] args) {
		System.out.println(a);
		a=11;
		a=111;
		System.out.println(a);
		
		Variable2 obj2=new Variable2();
		System.out.println(obj2.b);
		obj2.b=222;
		System.out.println(obj2.b);
	}
}
