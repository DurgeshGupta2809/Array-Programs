package Array;

public class ReverseArray {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6,7,8,9};
       int []b=new int[a.length];
       
       int j=a.length-1;
      
       for(int i=0; i<b.length; i++) {
			b[i]=a[j];
			j--;
		}
       for(int i=0; i<b.length; i++) {
    	   System.out.print(b[i]+"  ");
       }
      
	}

}
  