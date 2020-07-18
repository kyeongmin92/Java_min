package test1;


public class diamond {

	public static void main(String[] args) {
	      for(int i = 0; i < 5; i++){
	          for(int j = 1; j < 5 - i; j++){
	             System.out.print(" "); 
	          }
	          for(int j = 0; j < 2 * i + 1; j++){
	             System.out.print("*"); 
	          }
	          System.out.println("");
	       }
	       
	       for(int i = 0; i < 5; i++){
	          for(int j = 10; j > 9 - i; j--){
	             System.out.print(" "); 
	          }
	          for(int j = 8; j > 2 * i + 1; j--){
	             System.out.print("*"); 
	          }
	          System.out.println("");
	       }
	      
	}

}
