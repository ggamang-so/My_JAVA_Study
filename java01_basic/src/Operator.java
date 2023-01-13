
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 연산자
		 산술연산자(+,-,*,/,%)
		 부호(+, -)
		 대입연산자 ( =, +=, -=, *=, /=, %= )
		 
		 */
		
		int n1 = 1230;
		n1 = n1 *2; // n1 *= 2;
		n1 += 1; // n1 = n1 + 1;
		System.out.println("n1 = " + n1);
		
		//증감 연산자 ++, -- 
		char c = 'A';
		c++;  // B
		c++;  // C
		c--;  // B
		System.out.println(c);
		
		int n=5;
		int result1 = n++ + 10;   // ++가 뒤에 있으면 수식이 끝난 후에 그 변수에 1을 더한다. 
		System.out.println("n = " + n);
		System.out.println("result1 = " + result1);
		
		int m=5;
		int result2 = ++m + 10;   // ++가 앞에 있으면 수식 계산 전에 그 변수에 1을 더한 후 수식을 계산한다. 
		System.out.println("m = " + m);
		System.out.println("result2 = " + result2);
		
		String str1 = "JDK" + 11.0;  //   char + double = 문자로 연결됨
		String str2 = str1 + "의 특징"; // 문자와 문자 = 문자의 연결
		System.out.println(str2);
		
		String str3 = "JDK" + 10 + 1;  // "JDK101"  같은 우선순위의 연산자는 왼쪽부터 계산
		// JDK + 10이 먼저 계산되어 문자열이되고 + 1 하면 다시 문자열로 1이 연결
		String str4 =10 + 1 + "JDK"; // "11JDK"
		// 10 + 1이 먼저 연산되어 11이 되고 +"JDK" 와 문자로 연결됨
		System.out.println(str3);
		System.out.println(str4);
		
		int result3 = n + 2 * 8 / (2 % 7 + 2 - 3) * 3;
		System.out.println(result3);
		
		
		// 비트 논리연산자(2진수로 계산하기)
		//        &, |, ^(XOR), ~
		int a = 10;   // => 2진수로 표현하면 	00001010
		int b = 3;    // => 진수로 표현하면	 	00000011
		int r1 = a & b;  //      	       	00000010  ==> 2     '&' 연산자는 각 자리가 모두 1일때 1  
		int r2 = a | b;  // 		    	00001011  ==> 11	'|' 연산자는 둘중 하나만 1일어도 1
		int r3 = a ^ b;  // 		     	00001001  ==> 9		'^' 연산자는 각 자리가 1이면 
		int r4 = ~b;	 //					11111100  ==> -4		'~' 단항연산자로 0은 1로, 1은 0으로  										
		// 2의 보수 -> 1의 보수 +1 -> 
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		
		// 비트 이동 연산자(쉬프트연산자) : 비트를 이동하면서 연산하기
		// << : 왼쪽으로 이동
		// >> : 오른쪽으로 이동
		// >>> : 오른쪽으로 이동, 0으로 채워짐
		
		int r5 = a << 3; //왼쪽으로 3비트 이동해   00001010  ->  01010000 ==> 10진수로 80  
		System.out.println("r5 = " + r5);  //  ==> 10 * 2*3 과 같은값
		
		int r6 = a >> 3; //오른쪽으로 3비트 이동   00001010  ->  00000001 ==> 10진수로 1 
		System.out.println("r6 = " + r6);  //  ==> 10 / 2*3 의 몫과 같은값

		int r7 = r4 >> 3; //오른쪽으로 3비트 이동   
		System.out.println("r7 = " + r7);  //  
		
		int r8 = r4 >>> 3; //오른쪽으로 3비트 이동, 빈칸은 0으로 채움 
		System.out.println("r8 = " + r8);  //  
		
		int a3 = 536865481;
		int rr1 = ~a3;
		int rr2 = a3 >>> 5;
		int rr3 = ~a3 >> 5;
		int rr4 = a3 >> 5;
		
		System.out.println("rr1 = " + rr1);
		System.out.println("rr2 = " + rr2);
		System.out.println("rr3 = " + rr3);
		System.out.println("rr4 = " + rr4);
		
		
		
	}

}
