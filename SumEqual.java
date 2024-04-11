package Array;
                           // Sum of two numbers
public class SumEqual {

	public static void main(String[] args) {
		
		int a[]= {1,5,7,3,2,4};
		int b[]=new int[a.length];
		int c=a[0];
		int sum=6;
		
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=i+1; j<a.length; j++) {
				if(a[i]+a[j]==sum) {
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}
}
