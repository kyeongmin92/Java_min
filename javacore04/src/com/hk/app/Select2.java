package com.hk.app;

import java.util.Scanner;

public class Select2 {

	public static void main(String[] args) {
		// 90 이상 very good, 80 이상 good, 70 이상 not bad
          
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score>=90) { System.out.println("very good");
		} else if(score>=80){ System.out.println("good");
		} else if(score>=70){ System.out.println("not bad"); 
		}else { System.out.println(" ");
		
		}
		
	}

}
