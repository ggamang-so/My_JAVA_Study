import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		// 삼항 연산자
		// 임의의 정수를 입력받아 홀수, 짝수를 구별하여 출력하라.

		// 1.데이터 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int dataInt = scan.nextInt();

		// 2. 처리
		// 삼항연산자 구조
		// (조건문(true or false)? 수식 or 상수(true일때출력) : 수식 or 상수(false일때 출력);
		//
		boolean check = dataInt % 2 == 0;
		// 나머지로 하면 정수/정수 = 정수 , 정수/실수 = 실수 인것을 이용해서 나머지가 아닌 나누기로도 구할수 있음
		String result = (check) ? dataInt + "은 짝수입니다." : dataInt + "은 홀수입니다.";

		// 3. 출력
		System.out.println(result);

		// 임의의 정수를 입력받아 양수, 음수, 0 인지 구별하여 출력하라.

		String result2 = (dataInt > 0) ? "양수" : (dataInt == 0) ? "0" : "음수";
		System.out.println(dataInt + "는 " + result2 + "입니다.");

		/*
		 * 실행결과 정수입력 = 5 5는 홀수입니다. 5는 양수입니다.
		 * 
		 * 정수입력 = -12 -12는 짝수입니다. -12는 음수입니다.
		 * 
		 * 정수입력 = 0 0은 짝수입니다. 0은 0입니다.
		 */

	}

}
