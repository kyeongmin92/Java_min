package 배열;

public class Map2D {

	public static void main(String[] args) {
		
		int[][] num = new int[5][5];
		int k =1;
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				num[r][c] = k;
				k++;
			}
		}
		
		for(int y=0; y<5; y++) {
			for(int x=0; x<5; x++) {
				if(num[y][x]<=9) {
					System.out.print(" "+num[y][x]+" ");
				} else {
					System.out.print(num[y][x]+" ");
				}
				
			}
			System.out.println();
		}		

	}

}
