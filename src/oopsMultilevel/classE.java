package oopsMultilevel;

public class classE  extends  classD{
	public void method5() {
		System.out.println("I am a child");
	}
		public static void main(String[] args) {
			classE obj=new classE();
			obj.method3();
			obj.method4();
		    obj.method5();
	        
			
		}
}

