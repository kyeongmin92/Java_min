package Exam;

import java.util.Random;
import java.util.Scanner;

public class Exam06_2 {

	public static void main(String[] args) {
		/*	6. 두 자리의 숫자를 랜덤하게 생성하여 배열 num에 저장하고
		(자리 숫자가 중복되지 않게)
		
		키보드를 통해 두 자리의 숫자를 입력받는다
		(자리 숫자가 중복되거나 두 자리가 아니면 다시 입력받음)
		
		랜덤한 숫자와 입력한 숫자를 비교하여 랜덤한 숫자가 입력한 숫자보다 큰지 작은지를
		출력하고 숫자가 같아질 때까지 반복한다
		
		숫자가 같아지면 입력횟수와 맞춘 순자를 출력한다 */

		int[] num = new int[2];
		Random zen = new Random();
		while(true) {
			num[0] = zen.nextInt(9)+1;
			num[1] = zen.nextInt(10);
			if(num[0]!=num[1]) {
				break;
			}
		}		
		System.out.println("컴퓨터 랜덤 숫자 : "+(num[0]*10+num[1]));
		
		int[] num2 = new int[2];
		Scanner scan = new Scanner(System.in);
		int input =0;
		while(true) {
			System.out.print("두자리 숫자를 입력하세요: ");
			input = scan.nextInt();
			num2[0] = input/10;
			num2[1] = input%10;			
			
		}
	

	}

}
