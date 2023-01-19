package test001.basic;

public class Array2Ex03 {

	public Array2Ex03() {
		int[][] arr = new int[20][11];
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j != arr[i].length - 1) {
						a++;
						arr[i][j] = a;
						arr[i][arr[i].length - 1] += a;
						arr[arr.length - 1][j] += a;

					}
					System.out.print(arr[i][j] + "\t");

				}
				System.out.println();
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
			}

		}
	}
//

	public static void main(String[] args) {
		new Array2Ex03();

	}

}
