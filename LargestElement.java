package Array;
                                           // Max value of Array
import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		
//		int a[]= {1,4,6,7,89,4,5,96,7};
//		int max= a[0];
//		for(int i=0; i<=a.length-1; i++) {
//			
//		   	if(max<a[i]) {
//		   		max=a[i];
//		   	}
//		}
//		System.out.println("Maximum Element is : "+max);
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the values of Araay");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum Array Value is : "+max);
	}
}
