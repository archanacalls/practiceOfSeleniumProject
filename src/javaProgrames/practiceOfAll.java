package javaProgrames;
public class practiceOfAll {
	//count of A  specific character in a string
	public static void main(String[] args) {
		
		String a="I am a superWoman";
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'){
				count++;
			}
		   }
		System.out.println("The total count of a is"+ count);
			}
	
	
} 
