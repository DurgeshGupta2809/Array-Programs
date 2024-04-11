package SortingArray;
                              // Bubble Sort
public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {100,60,30,20,5};
		
		
		for(int i=0; i<a.length; i++) {
		
			boolean isSorted=true;
			for(int j=0; j<a.length-1-i; j++) {
				
				if(a[j]>a[j+1]) {
					
					isSorted=false;
				
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(isSorted) {
				System.out.println("Already Sorted...");
				break;
			}else {
				for(int k=0; k<a.length; k++) {
					System.out.println(a[k]);
				}
			
			}
			
		}
		
		
		
		
		
	}

}
