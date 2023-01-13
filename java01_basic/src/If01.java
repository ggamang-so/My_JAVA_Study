import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// 임의의 수를 입력받아 양수면 100을 곱하여 출력하라
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 = ");
		int n = scan.nextInt();
		int result = 0; // 선언만 하고 if 문 안에서 할당받지 못하면 if문 밖에서 result는 오류 발생
		if (n>0) {
			result = n*100;
			System.out.println(n +  "* 100 = '" + result+"'");
		}
		System.out.println("The end......"+ n + ", result -> " + result);
	}
	// main 메소드 안에서 선언된 n 변수는 main 메소드 밖에서는 없어짐
	// if 문 안에서 선언된 result 변수는 if문 밖에서는 없어짐
	// --> 지역변수(local variable)
}
