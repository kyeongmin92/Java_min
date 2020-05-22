package exam00;
import java.util.Scanner;

public class Exam03_1 {

	public static void main(String[] args) {
		int x, y, z=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째정수는?");
		x = scan.nextInt();
		System.out.println("두번째정수는?");
		y = scan.nextInt();
		
		z= x*y;
		
		System.out.println("두수의 곱은?"+z);

	}

}
