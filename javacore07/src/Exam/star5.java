package Exam;

public class star5 {

	public static void main(String[] args) {
		// 별찌기 다이아몬드
		
		for(int i=0; i<5; i++) {
			
			for(int j=4; j>i; j--) {
				System.out.print(" ");
				for(int k=0; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}	
			System.out.println();
		}

	}

}
