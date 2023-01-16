import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public InputStreamReaderTest() {
//		InputStreamReaderTest : 콘솔에서 문자(유닛코드)단위로 입력 받는 클래스
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			while(true) {
//				int strInt = isr.read();
//				System.out.println(strInt + " ===> " + (char)strInt);
				
				
				//배열을 이용한 입력
				char[] str = new char[10];
				
				int cnt = isr.read(str);
				System.out.println(cnt + " --> " + String.valueOf(str));
				
				
			}
			
		}catch(IOException ie) {
			
		}
		
	}

	public static void main(String[] args) {
		new InputStreamReaderTest();
	}

}
