package Array;

import java.util.Scanner;

public class SmallestOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the values of Araay");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int min=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Maximum Array Value is : "+min);
	}
}
