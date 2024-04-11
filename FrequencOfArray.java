package Array;

public class FrequencOfArray {

	public static void main(String[] args) {
		
		int [] a= {10,20,10,30,40,10,20,10,40,40};
		boolean[] b=new boolean[a.length];
		
		
		for(int i=0; i<b.length; i++) {
			int count=1;
			
		if(b[i]==false) {
			
			for(int j=i+1; j<b.length; j++) {
			
				if(a[i]==a[j]) {
					count++;
					b[j]=true;
				}
			}
			System.out.println(a[i]+" --> "+count);
		}
	}
  }
}
