package Exam;

public class Exam01_4 {

	public static void main(String[] args) {
	/*	*****
		 ****
		  ***
		   **
		    *
		        */
		
		
		String star = "*";
		String empty =" ";
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(empty);
			}
			for(int k =5; k>i; k--) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		

	}

}
