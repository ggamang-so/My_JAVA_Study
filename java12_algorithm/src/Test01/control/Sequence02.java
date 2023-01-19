package Test01.control;

import java.util.Scanner;

public class Sequence02 {
	public Sequence02() {

	}
	static void seqPrint(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = a - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		seqPrint(a);
	}
}
/*
 * 
 * 9 <--정수입력
 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********
 * 
 */
