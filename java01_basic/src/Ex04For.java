import java.util.Scanner;

public class Ex04For {

	public static void main(String[] args) {
		boolean check = true;
		int num = 0;
		
		do { Scanner scan = new Scanner(System.in);
			System.out.print("단을 입력하세요(2~9단) : ");
			num = scan.nextInt();
			if (num < 2 || num > 9) {
				System.out.println("단을 잘못입력하였습니다.");
				
			} else {
				for (int i = 1; i <= 9; i++) {
					System.out.println(num + " x " + i + " = " + (num * i));
				}
			}
			}while(true);


	

		
	}
}
/*
 * [실행] 단입력 -> 10 단을 잘못 입력하였습니다 단입력 -> 5 5*2 = 10 5*3 = 15
 * 
 * 5*9 = 45
 * 
 */