package test001.basic;

public class Array2Test {

	public Array2Test() {
	}

	public static void main(String[] args) {
		//2차원 배열
		
		int[][] arr; //선언
		int[][] arr2 = new int [7][5]; // 선언 및 초기화(크기할당)
		
		Object[][] obj = new Object[2][3]; // null
		
		
		arr2[1][0] = 100;
		arr2[2][1] = 2;
		
		// 2차원 배열에서는 배열명.length --> 행의 수가 나온다. 
		// 			   배열명[행index].length --> 행index의 칸수
		
		for(int row = 0; row<arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col]+"\t");
			}
			System.out.println();
		}
		
		//2차원 배열 초기값
		
		int[][] arr3 = new int[][] {
			{1,2,3},
			{10, 20, 20}, 
			{100, 200, 300}};
		String[][] arr4 = {{"A","B","C"},{"가","나","다"},{"1", "2", "3"}};
		
		for (int row = 0; row < arr3.length; row++) {
			for (int col = 0; col<arr3[row].length; col++) {
				System.out.print(arr4[row][col] + "\t");
			}
			System.out.println();
		}
		
	}

}
