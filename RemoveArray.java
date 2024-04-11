package Array;

public class RemoveArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int b[]=new int[a.length-1];
		
		int pos=4;
		
		for(int i=0; i<b.length; i++) {
			
			if(i<pos) {
				
				b[i]=a[i];
			}
			else if(i==pos) {
				
				b[i]=a[i+1];
			}
//			else if(i>pos) {
//				b[i]=a[i+1];
//			}
			
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+"  ");
		}

	}

}

