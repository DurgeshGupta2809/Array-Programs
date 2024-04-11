package Array;

public class SumOfTwoMax {

	public static void main(String[] args) {
		
		int []a= {10,20,25,50,12,16};
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
		    int sum=max+max2;
		  System.out.println("Sum of two max value : "+sum);  
		

	}

}
