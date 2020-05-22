package TextBook;

public class TextBook4_4 {

	public static void main(String[] args) {
		/* for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보시오
		  *
		  **
		  ***
		  ****
		  *****
		 */
		 
		 for(int i =1; i<=5; i++) { // 초기값 1, 총5번 반복 , 1씩 증가
			 
		     	for(int j=0; j<i; j++) { // 초기값 0, 변수i보다 적게 반복, 1씩증가
		     		System.out.print("*");	// 가로로 입력하기위해 'ln' 제거				 
			}
		     	System.out.println(""); // 반복 후 줄바꿈
		 }
		/* i 총 5번 반복    j 0번증가 *       
		 *             j 1번증가 **      
		 *             j 2번증가 ***    
		 *             j 3번증가 ****   
		 *             j 4번증가 *****  
		 */
	}

}
