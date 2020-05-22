package TextBook;

public class TextBook4_2 {

	public static void main(String[] args) {
		/* while문과 Math.random()메소드를 이용해서 두개의 주사위를 던졌을때
		 * 나오는 눈을 (눈1,눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를
		 * 던지고, 눈의 합이 5이면 실행을 멈추는 코드 작성
		 * (눈의 합이 5가 되는 조합은 (1,4) (4,1) (2,3) (3,2) 이다)
		 */
				
		while(true) { // 참이면 계속 반복
			int num1 = (int)(Math.random()*6)+1; // 1~6까지 랜덤
			int num2 = (int)(Math.random()*6)+1; // 1~6까지 랜덤
			System.out.println("("+num1+","+num2+")");
			if(num1+num2==5) { 
				break; // 변수 num1와 num2의 합계가 5가되면 멈춤 
			}
		}
		
		

	}

}
