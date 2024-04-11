package Array;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Values of Array");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Element inside Even index");
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.print(arr[i]+"  ");
			}
		}
		System.out.println();
		
		System.out.println("Even Element of Array");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+"  ");
			}
		}
		System.out.println();
		
		System.out.println("Element inside Odd index");
		for(int i=0; i<arr.length; i++) {
			if(i%2==1) {
				System.out.print(arr[i]+"  ");
			}
		}
		System.out.println();
		
		System.out.println("Odd Element of Array");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				System.out.print(arr[i]+"  ");
			}
		}
	}

}
