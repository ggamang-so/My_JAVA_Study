package Test01.control;

import java.util.Scanner;

/*
 * [실행결과]
 * 
 * 15 <--입력
 * 1 2 4 7 8 11 13 14
 */
public class Sequence01 {

	
	public Sequence01() {
		
	}
	static void seqPrint(int max) {
		for(int i=1; i<max; i++) {
			if (i%3 !=0 && i%5!=0) {
				System.out.print(i+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		seqPrint(max);
	}

}
