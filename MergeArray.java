package Array;

public class MergeArray {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {6,7,8,9};
		int a3[]=new int[a1.length+a2.length];
		int j=0;
		for(int i=0; i<a3.length; i++) {
			
			if(i<a1.length) {
				
				a3[i]=a1[i];
			}
			else {
				
				a3[i]=a2[j];
				j++;
			}
		}
		for(int i=0; i<a3.length; i++) {
			
			System.out.print(a3[i]+"  ");
		}
	}
}
