package com.hk.app;

public class Map2D02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var
				int[][] map =new int[5][5]; // 5행5열
				int k =1; // 대입할값
				
				// 2중반복문
				for(int r=0; r<5; r++) {
					
					for(int c=0; c<5; c++) {
						
						map[r][c] = k;
						
						k++;
					}
				}		      
		       
		        for(int y=0; y<5; y++) {
		        	
		        	if(y%2==0) {
		        		for(int x=0; x<5; x++) {
		        			System.out.print(map[y][x]+" ");
		        		}
		        	} else {
		        		for(int x=4; x>=0; x--) {
		        			System.out.print(map[y][x]+" ");
		        		}		        		
		        	}
		        	System.out.println();
		        }                   
                
		        
		        
             

	}

}
