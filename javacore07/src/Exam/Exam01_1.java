package Exam;

public class Exam01_1 {

	public static void main(String[] args) {
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 * 중첩 for 와 배열사용해서 출력
		 */
		String star = "*";
		String[][] star2 = new String [5][5] ;
		
		for(int i=0; i<5; i++) {
			for(int j=4; j>=i; j--) {
			  star2[i][j] = star;
			  System.out.print(star2[i][j]);			  
			}
			System.out.println();
		}

	}

}
