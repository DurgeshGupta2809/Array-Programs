package Array;

public class SubArray {

	public static void main(String[] args) {
		
		int a1[]= {1,4,3,2,9,7,8};
		int a2[]= {3,7,868};
        int c=0;
        
		for(int i=0; i<a2.length; i++) {
			boolean ispresent=false;
			
			for(int j=0; j<a1.length; j++) {
		    
				if(a2[i]==a1[j]) {
					ispresent=true;
				}	
			}
			if(ispresent==false) {
				c=1;
				break;
			}
		}
		if(c==0) {
			System.out.println("It is SubArray");
		}else {
			System.out.println("It is Not a SubArray");
		}
	}

}
