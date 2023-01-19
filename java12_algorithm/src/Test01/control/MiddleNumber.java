package Test01.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [문제]
 * 3개의 정수를 입력받아 중간값을 출력하라
 * 
 * [실행결과]
 * 54
 * 75
 * 34
 * 54
 * 
 */
public class MiddleNumber {
	static int a;
	static int b;
	static int c;
	public MiddleNumber() {
		
	}
//	public MiddleNumber(int[] nums) {
//		Arrays.sort(nums);
//		System.out.println(nums[1]);
//		
//	}
	
	static int inputNumber() {
//			int[] nums = new int[3];

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
//			for (int i = 0; i == nums.length-1; i++) {
//			nums[i] = Integer.parseInt(br.readLine());
//			}
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			c = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			if (a < b && a > c || a < b && a > c) {return a;}
			if (b < a && b > c || b < a && b > c) {return b;}
			if (c < a && c > b || c < a && c > b) {return c;}
			return -1;
	
		

		
	}


	public static void main(String[] args) {
		new MiddleNumber();
		
		
	}

}
