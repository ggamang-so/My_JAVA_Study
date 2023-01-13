import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class LottoNumber {

	public static void main(String[] args) {
		// 1~45까지 임의의 정수 중복없이 6개 뽑기
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int repeat;
		do {
			int bonus = 0;
			System.out.print("게임수 = ");
			int games = scan.nextInt();
			for (int times = 1; times <= games; times++) {
				int[] numbers = new int[6];

				for (int i = 0; i <= numbers.length; i++) { //numbers.length+1 번 반복한다. 정규번호 numbers.length만큼/ 보너스 1만큼

					label: while (true) {
						int a = ran.nextInt(45) + 1; // 랜덤수 생성 > numbers[0] ~ [i]  차례대로 a와 비교하여 같은게 있으면 > 랜덤수 생성
													 //           (numbers[i]에는 초기값 0이 들어감)            없으면 > numbers[i]에 a 값 넣기

						for (int j = 0; j < i; j++) {
							if (numbers[j] == a) {
								continue label;
							}
						}
						if (i == numbers.length) {  // i가 numbers.length와 같으면 생성된 난수를 bonus에 넣기
							bonus = a;
						} else {
							numbers[i] = a;
						}
						break;
					}

				}
				Arrays.sort(numbers);
				System.out.println(times + "게임="+Arrays.toString(numbers) + ", bonus : " + bonus);
			}
			System.out.print("게임을 더 진행하시겠습니까(1:yes, 2:no)?");
			repeat = scan.nextInt();
		} while (repeat == 1);
		System.out.println("게임이 종료되었습니다");

	} // 선생님 방식
	  // 랜덤수를 담을 배열의 크기를 채택할 번호의 갯수보다 한개 많게 생성하고 
	  // 반복을 통해 랜덤수를 생성하고 그 전에 배열에 들어간 숫자들과 비교하여 
	  // 같은 값이 있으면 i-- 하고 반복문을 다시 돌려 램덤수를 다시 생성하는 방식으로 중복없게 배열에 넣는다
	  // 그리고 앞에 6개만 배열 복사로 빼고 남은 7번째 숫자는 bonus로 넣어 출력
	  // 위 과정을 do~while 문으로 묶고 마지막에 게임 추가 진행 여부를 받아서 true/false 화 하면 됨

}
