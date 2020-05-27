package Exam;

public class Star1 {

	public static void main(String[] args) {
		/*  중첩 for문 이용해서  출력
		      *
		     **
		    ***
		   ****
		  *****     */
		
	    for(int i=0; i<5; i++) {
	    	
	    	for(int j=4; j>i; j--) {
	    		System.out.print(" ");
	    	}
	    		for(int k=0; k<=i; k++) {
	    			System.out.print("*");
	    	}	    	
	    	System.out.println();
	    }

	}

}
