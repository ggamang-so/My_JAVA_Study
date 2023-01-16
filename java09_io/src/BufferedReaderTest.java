import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public BufferedReaderTest() {
		// BufferedReader : 콘솔에서 입력받은 값을 버퍼에 임시로 저장 후 한줄 단위로 읽어올 수 있는 클래스
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//버퍼에서 1줄 읽어오기
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new BufferedReaderTest();
		
	}

}
