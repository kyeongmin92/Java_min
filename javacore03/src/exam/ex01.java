package exam;

public class ex01 {

	public static void main(String[] args) {
		/* 사과의 개수가 123개이고 이를 바구니에 담고자 한다
		      바구니는 10개씩 담을 수 있다 몇개의 바구니가 필요한가
		      자바프로그램 작성 */
		int apl = 123, bsk = 10;
		int a = (apl/bsk), b = (apl % bsk);
		int c = (b>=0)? 1 : 0;
		int result = (a+c);
		
		System.out.println(result);
		
     
	}

}
