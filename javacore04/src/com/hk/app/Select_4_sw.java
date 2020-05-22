package com.hk.app;

public class Select_4_sw {

	public static void main(String[] args) {
		// switch
		int age = 0;              // 나이
		char mil = ' ';      // 군대 공군 a 해군 m 육군 g
		String a = "공군", m= "해군", g="육군";
		 age = 50; 
	     mil = 'a';
	     if (age>=18 && mil!=' ') {
	    	 switch(mil) {
	    	 case 'a':
	    		 System.out.println("성인이고 공군 군필");
	    		 break;
	    	 case 'm':
	    		 System.out.println("성인이고 해군 군필");
	    		 break;
	    	 case 'g':
	    		 System.out.println("성인이고 육군 군필");
	    		 break;
	    	default:
	    		break;
	    	 }
	     }

	}

}
