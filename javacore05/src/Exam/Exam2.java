package Exam;

public class Exam2 {

	public static void main(String[] args) {
		/* x1 2 3 4 5 = 1 3 5 7 9
		 * y1 2 3 4 5 = 2 4 6 8 10
		 * x1*y1 x2*y1 x3*y1 x4*y1 x5*y1
		 * x1*y2 x2*y2 x3*y2 
		 * x1*y3 x2*y3 x3*y3
		 * x1*y4
		 * x1*y5
		 * 
		 */
		int x=0;
		int y=0;
		int mux=1;
         for(int i=0; i<5; i++) {
        	for(int j=0; j<5; j++) {
        		x = (i+1)*2;
        		y= (j*2)+1;
        		mux = x*y;
        		System.out.print(mux + " ");
        	}
         
         System.out.println("");
         }
         
	}

}
