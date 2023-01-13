import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// switch문 : 범위가 없는 조건문
		// 임의의 정수 입력받아 1 -> 빨강, 2 -> 노랑, 3-> 파랑, 4 -> 초록, 나머지->검정
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int dataInt = scan.nextInt();

		// int보다 작거나 같은 데이터형 변수 byte, short, int, char), String 을 넣을 수 switch 변수로 넣을 수
		// 있음
		switch (dataInt) {
		case 1:
			System.out.println("빨강");
			break;
		case 2:
			System.out.println("노랑");
			break;
		case 3:
			System.out.println("파랑");
			break;
		case 4:
			System.out.println("초록");
			break;

		default:
			System.out.println("검정");
		}

	}

}
