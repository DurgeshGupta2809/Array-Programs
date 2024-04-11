package Array;
                                   // Binary Search
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		
		int a[]= new int [size];
		System.out.println("Enter the values of array");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Sorted");
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Enter the Search of element");
		int ele =sc.nextInt();
	    int l=0;
		int r=a.length-1;
		boolean ispresent=false;
		
		while(l<=r)
		{
		int mid=(l+r)/2;
		if(ele==a[mid]) {
			ispresent=true;
			System.out.println("Element Found");
			break;
		}
		else if(ele>a[mid]) {
			l=mid+1;
		}
		else if(ele<a[mid]) {
			r=mid-1;		
		}
	 }
		if(ispresent==false) {
			System.out.println("Element is Not Found");
		}
	}
}
