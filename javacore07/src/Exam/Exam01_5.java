package Exam;

public class Exam01_5 {

	public static void main(String[] args) {
		
		String star = "*";
		String empty =" ";
		
		for (int i =0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				if(j>i) {
					System.out.print(empty);
				} else {
					System.out.print(star);
				}
			}
			System.out.println();
		} 
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
		    	System.out.print(star);
			}
			System.out.println();
		}
		

	}

}
