package Array;

public class RotateRight {

	public static void main(String[] args) {
		
		int a[]= {1,2,7,10,15};
		
		int temp=a[0];
		
		for(int i=1; i<a.length; i++) {
			
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		
        for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
		
	}

}
