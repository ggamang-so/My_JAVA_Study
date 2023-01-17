package Test01.control;

import java.util.Random;
import java.util.Scanner;

public class Numbermatches {
	/*
	 * 처리조건 두 자리수의 난수를 생성하여 맞추는 게임을 작성하라
	 * 
	 * [처리결과] 숫자 입력 = 56 컴퓨터의 수가 더 작습니다. 숫자입력=24 컴퓨터의 수가 더 큽니다. 숫자입력 = 25 축하합니다.
	 * 3번만에 맞추셨습니다. 계속하시겠습니까(Y/y)?y
	 * 
	 * 숫자입력 = 65 컴퓨터의 수가 더 작습니다. 숫자입력 = 45 컴퓨터의 수가 더 큽니다. 숫자입력 = 34 축하합니다. 3번만에
	 * 맞추셨습니다. 계속하시겠습니까(Y/y)?n
	 * 
	 */

	// 난수 만들기
	Random ran = new Random();
	int num;
	int cnt;
	String repeat;

	// 숫자 입력하기
	Scanner scan = new Scanner(System.in);

	public Numbermatches() {
		
	game: do {
			num = ran.nextInt(99-10+1)+10;
			cnt = 1;
			System.out.print("숫자입력 = ");
			do {
				int j = Integer.parseInt(scan.nextLine());
				if (j>num) {
					System.out.println("컴퓨터의 수가 더 작습니다.");

				}else if(j<num){
					System.out.println("컴퓨터의 수가 더 큽니다.");
				}else {
					System.out.printf("축하합니다. %d번만에 맞추셨습니다.\n",cnt);
					break;
				}
				cnt++;
				
			}while(true);
			System.out.print("계속하시겠습니까(Y/y)?");
			repeat = scan.nextLine();
		}while(repeat.equalsIgnoreCase("Y"));
		
	
		
	}

	public static void main(String[] args) {
		new Numbermatches();
	}

}
