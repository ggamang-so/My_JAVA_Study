import java.util.InputMismatchException;
import java.util.Scanner;
// 금액을 입력받아 회폐의 수를 출력하라.

public class Ex09MoneyCount {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		try {
		System.out.print("금액을 입력하세요 : ");
		int money1 = scan.nextInt();
		int money2 = money1;
		// array 사용한거
		int curr[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int index[] = new int[curr.length];
		char unit;
		for (int i=0; i< curr.length; i++) {
			index[i] = money1/curr[i];
			if(curr[3]>money1) {
				unit = '개';
			}else {
				unit = '장';
			}
			money1 -= curr[i] * index[i];
			if (index[i]==0) {
				continue;
			}
	
			System.out.println(curr[i]+"원="+index[i]+unit);
			
			// array 안쓰고
			int curr2 = 100000;
			int count;

			label: for (int i1=1;;i1++) {
				if(money2 < 5) {
					break label;
				}else {	
					for (int j=2;j<=5;j+=3) {
						count = money2/(curr2/j);
						curr2/=j;
						if(count==0) {
							continue;
						}
						System.out.println(curr2+"원="+count+"장");
						money2 -= curr2*count;
						
					}
				}
			}
		}
		}catch(InputMismatchException e) {
			System.out.println("숫자(정수)를 입력해주세요.");
		}finally {
		}
			
		}
		
		
				
				
						
				

					

		
	
		
		
	
		
		
		

		
	
	
}
