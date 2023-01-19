package test001.basic;

import java.util.Scanner;

public class RecursiveEx {
/* 두 수를 입력받아 거듭 제곱을 재귀호출로 작성하라
	[입력]
	5
	3
	[결과]
	125
	
*/	
	static int result=1;
	static void powerRecur(int a, int b) {
		if(b==0) return;
		result*=a;
		powerRecur(a, b-1);
	}
	
	static int powerRecurWithReturn(int a, int b) {
		if(b==1) return a;
		return a* powerRecurWithReturn(a,b-1);
	}
	public RecursiveEx() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		powerRecur(a, b);
		System.out.println(result);
		System.out.println( powerRecurWithReturn(a, b));
		
	}

}
