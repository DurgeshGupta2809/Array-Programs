package Array;

import java.util.Scanner;

public class ArrayPrimeOrNOt {

	public static void main(String[] args) {
		
		int a[]= {2,12,5,7,9,15,11,25};
        
       for(int i=0; i<a.length; i++) {
    	  
    	   if(isprime(a[i])) {
    		   
    		   System.out.println(a[i]+" is Prime");
    	   }
//    	   else {
//    		   System.out.println("Not Prime");
//    	   }
       }
    }
 public static boolean isprime(int a)
    	{
		if(a<=1) {
			
			return false;
		}

		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
}

