package javaProgrames;

import java.util.Arrays;

public class secondMaxNumber {

	public static void main(String[] args) {
  int a[] = {65,98,4,11,35,90,95,99};
  int temp;
  
  for(int i=0;i<a.length;i++) {
	  for(int j=i+1;j<a.length;j++) {
		  if(a[i]>a[j]) {
			  temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			 
		  }
	  }
  }
  System.out.println(Arrays.toString(a));
  System.out.println(a[1]);
	}

}
