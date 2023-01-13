import java.util.Scanner;

public class Ex07While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("양의 정수 = ");
			int num = scan.nextInt();
			int sum=0;
			for (int i=1;i<=num;i++) {
				sum+=i;
			}
			System.out.println("1~"+num+"까지의 합은 "+sum);
			System.out.print("계속하시겠습니까(1:yes, other:no)?");
			int exit = scan.nextInt();
			if (exit>=2) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}

	}

}
/*
 양의 정수 = 10
 1~10까지의 합은 55
 계속하시곗습니까?(1:yes , 2:no)? 1
 
 양의 정수 = 100
 1~100까지의 합은 5050
 계속하시곗습니까?(1:yes , 2:no)? 2
  
 프로그램이 종료되었습니다.
 
 */