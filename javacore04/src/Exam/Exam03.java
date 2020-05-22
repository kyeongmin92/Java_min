package Exam;

public class Exam03 {

	public static void main(String[] args) {
		// switch문을 if 문으로 바꾸어라
        /* int grade = 1;
         * case 1: System.out.print("You are a freshman"); break;
         * case 2: System.out.print("You are a sophomore"); break;
         * case 3: System.out.print("You are a junior"); break;
         * case 4: System.out.print("You are a freshman"); break;
         */
		int grade = 1;
		if(grade ==1) {
			System.out.println("You are a freshman");
		} else if (grade==2) {
			System.out.println("You are a sophomore");
		} else if (grade==3) {
			System.out.println("You are a junior");
		} else {
			System.out.println("You are a freshman");
		}
	}

}
