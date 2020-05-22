package Exam;

public class Exam04 {

	public static void main(String[] args) {
	/*	4. java, oracle, css, spring, project를 저장할
		문자열 배열 subject를 만들어서 대입하고 각각의 값을 출력  */
		String[] subject = {"java", "oracle", "css", "spring", "project"};
	//	System.out.println(subject[0]+" "+subject[1]+" "+subject[2]+" "+subject[3]+" "+subject[4]);
       for(int i=0; i<subject.length; i++) {
    	   System.out.println(subject[i]);
       }
	}

}
