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

	public MiddleNumber() {
		
	}
	public MiddleNumber(int[] nums) {
		Arrays.sort(nums);
		System.out.println(nums[1]);
		
	}
	
	static int[] inputNumber() {
			int[] nums = new int[3];
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			nums[0] = Integer.parseInt(br.readLine());
			nums[1] = Integer.parseInt(br.readLine());
			nums[2] = Integer.parseInt(br.readLine());

			
		

		
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return nums;
	}


	public static void main(String[] args) {
		new MiddleNumber(inputNumber());
		
		
	}

}
