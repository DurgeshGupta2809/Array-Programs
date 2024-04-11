package Array;

import java.util.Iterator;

public class RemoveDublicate {               // not complete

	public static void main(String[] args) {
		
		int a[]= {1,2,3,1,2,3};
		int co=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{	
					
					a[j]=Integer.MIN_VALUE;
					co++;
				}
			}
				
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(co);
		int b[]=new int[a.length-co];
		System.out.println(b.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a[]= {10,20,30,10,40,20,50,30};
//        int b[]=new int[a.length];
//		for(int i=0; i<a.length; i++) {
//			
//			for(int j=i+1; j<b.length; j++) {
//				if(a[i]==a[j]) {
//					
//					b[j]=a[i];
//					System.out.println(b[i]);
//				}
//			}
//		}
		
		
		
//		
//		int a[]= {10,20,30,40,10,30,20,50};
//		int c=0;
//		
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]!=Integer.MIN_VALUE)
//			{
//			for (int j = i+1; j < a.length; j++) {
//				if(a[i]==a[j])
//				{
//					a[j]=Integer.MIN_VALUE;
//					c++;
//				}
//				
//			}
//			}
//			for (int j = 0; j < a.length; j++)
//			{
//				System.out.print (a[j]+" ");
//				
//			}
//			int kp=0;
//			int arr[]=new int[a.length-c];
//			for (int j = 0; j < a.length; j++) {
//				if(a[j]!=Integer.MIN_VALUE)
//				{
//					arr[kp]=a[j];
//					kp++;
//				}
//				
//			}
//			for (int j  = 0;j  < arr.length; j++) {
//				System.out.print(arr[j]+" ");
//			}
			
			
		
		
		
		
		
//		int jk=0;
//		
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]==a[j]) {
//					count++;
//				}
//		}
//			b[i]=a[i];
//	}
//		System.out.println("Count is : "+count);
//		
//		for(int i=0; i<b.length; i++) {
//			if(a[i]!=min) {
//				b[j]=a[i];
//				j++;
//			}
//		}
//		int b[]=new int[a.length-count];
//		for(int i=0; i<b.length; i++) {
//			System.out.println(b[i]);
//		}
	}
}

