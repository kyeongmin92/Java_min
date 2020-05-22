package TextBook;

public class TextBook4_3 {

	public static void main(String[] args) {
		/* 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 
		 * (x,y) 형태로 출력해보시오
		 * (단, x와 y는 10 이하의 자연수입니다.)
		 */
			
		for(int x=0; x<=10; x++) { // 변수 x는 0으로 초기화, x 11번 반복, x 1씩증가
			
			for(int y=0; y<=10; y++) { // 변수 y는 0, y 11번 반복, y 1씩증가
				if((4*x)+(5*y)==60) { 
					System.out.println("("+x+","+y+")");
					// x와 y가 조건식에 부합하는 경우 x와 y값 출력  
				} 
			}
		}

	}

}
