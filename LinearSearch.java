package Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=sc.nextInt();
		System.out.println("Enter the values for array");

		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element of Search");
		int ele=sc.nextInt();
		if(linearSearch(arr,ele)) {
			System.out.println("Element is found");
		}else {
			System.out.println("Element is not found");
		}
	}
		public static boolean linearSearch(int a[],int ele) {
			for(int i=0; i<a.length; i++) {
				if(a[i]==ele) {
					return true;
				}
			}
			return false;
		}
}
