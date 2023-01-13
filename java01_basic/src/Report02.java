//2421 구구단 3단씩 출력
public class Report02 {

	public static void main(String[] args) {
		System.out.println("\t  구구단");
		
		int step = 10;
		for (int i = 1; i <= 9; i += step) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k<=step-1; k++) {
					if (j==1) {
						System.out.print("==" + (i+k) + "단==   ");
					}else {
						if ((i+k)*j<10) {
							System.out.print((i+k) + "*" + j + "=" +((i+k)*j)+"    ");
						}else {
							System.out.print((i+k) + "*" + j + "=" +((i+k)*j)+"   ");
						}
						
						

					}
					
				}
				System.out.println(); // 3번 반복하고 줄바꿈
			}

		}

	}

}
