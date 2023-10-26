package javaProgrames;

public class countOfWords {
	public static void main(String[] args) {
		String j="HI , Archana how are you ?";
		String p[]=j.split(" ");
		System.out.println(p.length);
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i].length()+" ");
			
			
		}
	}

}
