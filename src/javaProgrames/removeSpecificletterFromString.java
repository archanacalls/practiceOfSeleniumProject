package javaProgrames;

public class removeSpecificletterFromString {
	public static void main(String[] args) {
		 String str= "air aeroplane airport";
		str = str.replaceAll("[a]"," ");
		System.out.print(str);
		
	}

}
