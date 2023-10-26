package hirarachicalInheritance;

import oopsMultilevel.classD;

public class classG extends classF{
	public static void method2() {
		System.out.print("I am first child");
	}

	public static void main(String[] args) {
		classF obj=new classF();
		obj.method1();
		method2();
	}
}
