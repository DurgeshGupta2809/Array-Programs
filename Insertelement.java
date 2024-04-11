package Array;

public class Insertelement {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]=new int[a.length+1];
		int element=100;
		int pos=2;
		
		for(int i=0; i<b.length; i++) {
			
			if(i<pos) {
				
				b[i]=a[i];
			}
			else if(i==pos) {
				
				b[i]=element;
				
			}else {
			
				b[i]=a[i-1];
			}
		}
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	
	}
}
