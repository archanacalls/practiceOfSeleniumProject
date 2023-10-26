package hirarachicalInheritance;

public class classH extends classF {
	
	public static void method3() {

		System.out.print("I am second child");
	}
		
	
 public static void main(String[] args) {
	 classF obj=new classF();
		obj.method1();
		method3();
	
		
}
}