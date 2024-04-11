package SortingArray;

import java.util.Arrays;

public class InbuiltSorting {

	public static void main(String[] args) {
		
		int a[]= {3,4,6,4,2,4,5,7,8};
		int b[]=new int[a.length];
		Arrays.sort(a);
	
		System.out.println("Ascending Order");
        for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			b[i]=a[i];
		}
		
        System.out.println("Decending Order");
		for(int i=b.length-1; i>=0; i--) {
			System.out.println(b[i]);
		}

	}

}
