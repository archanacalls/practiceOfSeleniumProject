package javaProgrames;

public class PigLatin {

		public static void main(String args[]) {
		    
		 String a="rainbow";
		 String b="";
		 
		 for(int i=0;i<a.length();i++){
		     char ch=a.charAt(i);
		     
		     if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
		         
		         b=a.substring(i)+a.substring(0,i)+"AY";
		         
		         System.out.println(b);
		         break;
		     }
		 }

		   }

}
