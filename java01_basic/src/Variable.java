
public class Variable {
	//멤버 변수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double n1 = 15.8;
		float n2 = (float)15.3;
		
		int data3 = (int)n1;
		
		char c1 = 'A';
		String name = "홍길동";  //문자열은 ""로 묶어줘야한다
				
		c1++;  // 문자도 연산이 되늰데, 아스키코드상 숫자로 더해짐
		System.out.println("c1 = " + c1);  // B  -->66 (아스키코드상)
		// char + int = int
		c1 = (char)(c1 + 1); //C
		System.out.println("c1 = " + c1);
		
		// int + double = double
		// 더 큰 타입의 병수와 더하면 더 큰 타입의 변수로 타입이 자동형변환된다.
		
		int result = (int)(data3 +n1);   // 15 + 15.8 = 30
		System.out.println(c1 + ", " + result);
		char c2 = 'B';
		int result2 = c1 + c2;
		System.out.println("result2 = " + result2);
		
		int data4 = 5;
		System.out.println(data4);
			// main 내 지역변수  - main 메소드를 나가면 존재하지 않음
		
		//int /int = int
		// int / double = double
		int a = 10 / 3;
		double b = 10 / 3.0;
		
	}
	
}
