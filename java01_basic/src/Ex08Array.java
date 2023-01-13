import java.util.Scanner;

public class Ex08Array {

	public static void main(String[] args) {
		// 한 학생의 국어, 영어, 수학, 물리, 과학, 체육점수를 입력받아 촘점, 평균을 구하여라
		
		String msg[] = {"국어","영어","수학","물리","과학","체육"};
		
		// 각 과목의 점수, 총점, 평균을 담을 수 있는 배열형 변수 선언
		
		int scores[] = new int[(msg.length + 2)];
		
		// 점수 입력 -> 반복문으로
		int sum=0;
		for (int i = 0; i<msg.length; i++) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg[i] + " =");
		scores[i] = scan.nextInt();
		scores[scores.length-2] += scores[i];
		
		}		
		
		
	
		scores[scores.length-1] = scores[scores.length-2]/msg.length;
		
		for (int data : scores) {
			System.out.println(data);
		}

	}

}
