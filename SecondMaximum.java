package Array;

import java.util.Scanner;

public class SecondMaximum {

	public static void main(String[] args) {
		
//		int a[]= {1,4,6,7,89,4,5,96,7};
//		int max= a[0];
//		int max2= 0;
//		for(int i=0; i<a.length; i++) {
//			
//		   	if(max<a[i]) {
//		   		max2=max;
//		   		max=a[i];
//		   		
//		   	}else if(max2<a[i] && a[i]<max) {
//		   		max2=a[i];
//		   	}
//		}
//		System.out.println("Second Maximum Element is : "+max2);
       
		
		
		
		// ++++++++++++++++++++++++++++++++++++++++++++//
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
	    int a[]=new int[size];
	    System.out.println("Enter the valuse of Array");
	    for(int i=0; i<a.length; i++) {
	    	a[i]=sc.nextInt();
	    }
	    
	    int max=a[0];
	    int max2=0;
	    for(int i=0; i<a.length; i++) {
	    	if(max<a[i]) {
	    	max2=max;
	    	max=a[i];
	    }
	    else if(max2<a[i] && a[i]<max) {
	    	max2= a[i];
	    }
	  }   
	  System.out.println("The Max Value : "+max);  
	  System.out.println("The Second Max Value : "+max2);
	    
	}

}
