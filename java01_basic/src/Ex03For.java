//2148	2421
import java.util.Scanner;

public class Ex03For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요(5이상) : ");
		int num = scan.nextInt();
		if (num<5) {
			System.out.println("5 이상의 정수로 입력해주세요.");
			return;
		}
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		int threeMulSum = 0;
		for (int i =1; i<= num; i++) {
			sum += i;
		}
		for (int i=1;i<=num;i+=2) {
			oddSum += i;
		}
		for (int i=2;i<=num;i+=2) {
			evenSum += i;
		}
		for (int i=3;i<=num;i+=3) {
			threeMulSum += i;
		}
		System.out.println("1~"+num+"까지의 합은 "+sum);
		System.out.println("1~"+num+"까지 짝수의 합은 "+oddSum);
		System.out.println("1~"+num+"까지 홀수의 합은 "+evenSum);
		System.out.println("1~"+num+"까지 3의 배수의 합은 "+threeMulSum);

	}

}

/*
 * [실행]
 * 정수(5이상)?9
 * 1~9까지의 합은 45
 * 1~9까지 홀수의 합은 25
 * 1~9까지 짝수의 합은 20
 * 1~9까지 3의 배수의 합은 18
 *
 * */
 