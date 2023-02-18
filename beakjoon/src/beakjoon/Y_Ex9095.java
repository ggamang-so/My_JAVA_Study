package beakjoon;

import java.util.Scanner;

public class Y_Ex9095 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			if(i<3){
				arr[i] = (int)Math.pow(2, i);
			}else {
				arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
			}
		};
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		int[] result = new int[t];
		for (int i = 0; i < t; i++) {
			result[i] = Integer.parseInt(scan.nextLine());
		}
		for (int i = 0; i < t; i++) {
			System.out.println(arr[result[i]-1]);;
		}
	}

}
