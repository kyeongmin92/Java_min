package test1;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		String a = "name";
		String b = "email";
		Scanner scan = new Scanner(System.in);
		System.out.print("이름은?");
		a = scan.nextLine();
		System.out.print("이메일 주소는?");
		b = scan.nextLine();
		
		System.out.println("이름:"+a);
		System.out.println("이메일 주소:"+b);
	

	}

}
