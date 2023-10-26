package oopsMultilevel;

public class classD extends classC{
	public  void method4() {
		System.out.println("I am parent");
	}
		public static void main(String[] args) {
			classD obj=new classD();
			obj.method3();
			obj.method4();
			
			
		}
}
