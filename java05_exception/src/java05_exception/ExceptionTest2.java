package java05_exception;

import java.util.Scanner;

public class ExceptionTest2 {
	Scanner scan = new Scanner(System.in);

	public ExceptionTest2() {
	}

	public void start() {
		try {
		System.out.print("첫번째수 = "); // InputMismatchException
		int num1 = scan.nextInt();
		System.out.print("두번째수 = ");// InputMismatchException
		int num2 = scan.nextInt();

		int hap = num1 + num2;
		int cha = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;// ArithmeticException

		System.out.printf("%d + %d = %d \n", num1, num2, hap);
		// printf %d 정수 %10d 는 10자리 확보하고 오른쪽 정렬로 %-10d 는 10자리 확보하고 왼쪽정렬로
		// %f 실수 %7.2f 는 총 7자리확보하고 소숫점 2자리 표현--> 정수부 4자리, 소수점 1자리, 소수점 뒤로 2자리
		System.out.printf("%d - %d = %d \n", num1, num2, cha);
		System.out.printf("%d * %d = %d \n", num1, num2, mul);
		System.out.printf("%d / %d = %d \n", num1, num2, div);

		int[] data = { 10, 20, 30 };
		System.out.println("배열 = " + data[data.length]); // ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(" 배열의 index가 잘못 처리되었습니다.");
		}catch(Exception a) { // 모든 예외 클래스는 Exception 클래스를 상속받고 있어 Exception 을 넣어준다.
								// 하위클래스는 상위클래스에 대입 가능하다.
								// 하위 예외 클래스는 먼저 쓰고  Exception 을 쓰면 지정한 예외 클래스를 제외한 다른 예외 발생시 
								// Exception이 다 받는다.
			System.out.println("입력값은 정수를 입력하고 두번째 값은 0을 제외하고 입력해 주세요.");
			
		}
	}

	public static void main(String[] args) {
		new ExceptionTest2().start();
	}
}
