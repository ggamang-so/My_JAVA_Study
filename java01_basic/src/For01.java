
public class For01 {

	public static void main(String[] args) {
		// 1 ~ 5
		// 제어문자
		// \n : 줄바꿈
		// \t : tap(8칸간격으로 띄어쓰기)
		// \" : "" 사이에 "를 문자로 쓰고 싶을때
		// \' : '' 사이에서 '를 문자로 쓰고 싶을때

		System.out.println("1\n2\n3\n4\n5");
		System.out.println("1\t2\t3\t4\t5");

		System.out.println("나는 \'홍길동\' 입니다 ");
		System.out.println("나는 '홍길동' 입니다 ");

		int oddSum = 0;

		// for문 : 지정한 회전수 만큼 반복한다.
		for (int i = 1; 10 >= i; i += 2) {
			oddSum += i;
			System.out.println(i);
		}
		System.out.println("홀수의 합 = " + oddSum);
		for(int i=65; i<=90; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		for(char alp='A'; alp<='Z'; alp++) {
			System.out.print(alp);
		}
	}
}
