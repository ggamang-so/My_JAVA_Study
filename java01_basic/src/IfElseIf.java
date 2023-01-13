import java.util.Iterator;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// if~else if문
		// 분류기준이 2이상일때 사용할 수 있다.
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요 : ");
		float kor = scan.nextFloat();
		char grade;
		if (kor >= 90) {
			grade = 'A';
		} else if (kor >= 80) {
			grade = 'B';
		} else if (kor >= 70) {
			grade = 'C';
		} else if (kor >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("당신의 학점은 '" + grade + "'입니다.");

	}
}
