import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {
		//문자열을 특정문자로 쪼개기
		// 연속 구분기호일때는 공백을 버린다. 
		
		String data = "12 54,32. 65 76:32 75";
		StringTokenizer st = new StringTokenizer(data, " ,.:");
		
		System.out.println("조각난 토큰 수 = " +st.countTokens());
		//StringTokenizer 는 인덱스가 없음. nextToken() 메소드를 이용하여 토큰을 얻어와야함
		// 토큰의 합 구하기
		int sum = 0;
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		
		
	}

	public static void main(String[] args) {
		new StringTokenizerTest();
	}

}
