package test1;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		 //문제:섭씨온도(double형)으로 입력
		 //화씨로 출력하시오
		
		double C;
		Scanner scan = new Scanner(System.in);
				
		System.out.print("섭씨온도:");
		C = scan.nextDouble();

		double F = 9.0/5.0 * C +32;
		System.out.print("화씨온도:"+F);
		
		
		
		
		
		
		
		
		

	}

}
