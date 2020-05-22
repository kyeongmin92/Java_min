package TextBook;

public class Textbook4_1 {

	public static void main(String[] args) {
		/* for문을 이용해서 1부터 100까지의 정수 중에서 
		 * 3의 배수의 총합을 구하는 코드 작성
		 */
		int sum = 0; // 합계 변수 초기값 0 선언
		
		for(int i=0; i<100; i++) { // 변수 i 초기값 0 선언, 100번 반복, 1씩 증가
			if(i%3==0) { // 변수 i를 3으로 나눈 나머지가 0 일 경우
				sum += i;				// 합계는 합계 + i
			}
		}
		System.out.println(sum); 

	}

}
