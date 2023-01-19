package test001.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array2Ex01 {

	public Array2Ex01() {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());
		int input = 0;
		int[][] arr = new int[row][col];
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				input++;
				arr[i][j]= input;
				
			}
		}
		
		System.out.println("*** 행 우선 탐색 ***");
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("*** 열 우선 탐색 ***");
		for (int i = 0; i<col; i++) {
			for (int j = 0; j<row; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("*** 지그재그 탐색 ***");
		for (int i = 0; i<row; i++) {
			if(i%2==0) {
				for (int j = 0; j<col; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			if(i%2==1) {
				for (int j = col-1; j>=0; j--) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		}
		}catch(Exception e) {
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		new Array2Ex01();
	}

}
