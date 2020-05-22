package exam;
import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) {
		
        int i, j;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("첫번째 수를 입력하세요");
        	i = scan.nextInt();
        	System.out.println("두번째 수를 입력하세요");
        	j = scan.nextInt();
        	int k = i*j;
        	
        	System.out.println(i+"와"+j+"을(를) 곱하면" + k+"입니다"); 
        
       
	}

}
