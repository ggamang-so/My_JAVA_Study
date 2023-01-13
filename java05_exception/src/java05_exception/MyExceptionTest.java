package java05_exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	Scanner scan = new Scanner(System.in);

	public MyExceptionTest() {

	}

	public void start() {
		// 임의의 정수를 입력받아 그 수까지의 합을 구하기
		try {
		System.out.print("정수 = ");
		int max = scan.nextInt();
			if(1 <= max && max <= 100) {
			int tot = sum(max);
			System.out.printf("1~%d까지의 합은 %d \n", max, tot);
			}else {
				// throw : 강제로 예외 발생시키기
//				throw new MyException();
				throw new MyException("1~100 사이만 넣어");
			}
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		}catch(MyException me) {
			System.out.println(me.getMessage());
		}
	}

	public int sum(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;

		}
		return sum;
	}

	public static void main(String args[]) {
		new MyExceptionTest().start();
	}

}
