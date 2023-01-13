import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		//if~else문 : 평균이 60점을 기준으로 합격 불합격을 나눌때
		// 임의의 정수를 입력받아 양수(0포함)이면 입력받은 값에 100을 곱하여 출력하고 
		//				   음수면 양수로 만들고 200을 곱하여 출력하라.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int dataInt = scan.nextInt();
		int result;
		if (dataInt>= 0) {
			result = dataInt * 100;
		}else {
			result = -dataInt * 200;			
		}
		System.out.println("result = " + result);
		// result 값을 선언하지 않았어도 에러가 안나는 이유는 if 든 else든 둘중 하나는 실행될것이고 
		// 그러면 result값이 할당 받기 때문임. 
		
	}

}
