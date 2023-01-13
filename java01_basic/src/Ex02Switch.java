import java.util.Scanner;

public class Ex02Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수 =");
		int koreaScore = scan.nextInt();
		System.out.print("영어점수 =");
		int englishScore = scan.nextInt();
		System.out.print("수학점수 =");
		int mathScore = scan.nextInt();
		int sum = koreaScore + englishScore + mathScore;
		double average = (sum) / 3.0;
		char grade;
		switch ((int) average / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + average);
		System.out.println("학점 = " + grade);

	}

}
/*
 * [처리조건] 콘솔에서 국어, 영어, 수학점수를 입력받아 다음과 같이 출력 단, 평균은 실수로 구하라 학점은 switch문을 이용하라
 * 
 * [실행결과] 국어점수 = 영어점수 = 수학점수 = 평균 = 학점 =
 * 
 */
