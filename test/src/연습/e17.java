package 연습;

public class e17 {

	public static void main(String[] args) {
		int[] no = new int[10];
		int mux =1;
		
		for(int i=0; i<no.length; i++) {
			no[i] += i+1;
			mux *=no[i];
			System.out.println(no[i]);
		}
		System.out.println(mux);
		

	}

}
