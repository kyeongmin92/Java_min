package Exam;

public class Exam01_3 {

	public static void main(String[] args) {
		/*      *
		 *     **
		 *    ***
		 *   ****
		 *  ***** 
		 */
		
		
		String star = "*";
		String empty =" ";
		
	/*	for (int i =0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				if(j>i) {
					System.out.print(empty);
				} else {
					System.out.print(star);
				}
			}
			System.out.println();
		}  */
		
		for(int i=0; i<5; i++) {
			
			for(int j=4; j>i; j--) {
				System.out.print(empty);
			}
			for(int k=0; k<=i; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
		

	}

}
