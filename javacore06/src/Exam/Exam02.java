package Exam;

public class Exam02 {

	public static void main(String[] args) {
	/*	2. 1부터 10까지를 저장할 정수형 배열 no을 만들어서 대입하고
		각각을 서로 곱한 값을 출력하라 */
		int[] no = new int[10];
		int mux =1;
		for(int i=1; i<no.length; i++) {
			no[i] += i;
			mux *= no[i];
			
		}
	 	System.out.println(mux);	

	}

}
