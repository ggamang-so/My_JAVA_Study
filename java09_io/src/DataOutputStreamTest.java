import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataOutputStreamTest {

	public DataOutputStreamTest() {
		// DataOutputStream : 기본데이터 형의 값을 해단ㅇ 데이터형의 byte만큼 확보하여 저장한다.
		// DataOutputStream은 OutputStream 객체를 매개변수로 요구하여
		// FileOutputStream객체를 OutputStream에 넣어 입력

		try {
			File file = new File("F://java_test", "data.txt");
			OutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);

			int dataInt = 5434;
			double dataDouble = 562.2358;
			boolean dataBoolean = true;
			char dataChar = 'Z';

			dos.writeInt(dataInt);
			dos.writeDouble(dataDouble);
			dos.writeBoolean(dataBoolean);
			dos.writeChar(dataChar);

			dos.close();
			fos.close();
			System.out.println("쓰기완료");

		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (IOException ie) {

		}

	}

	public static void main(String[] args) {
		new DataOutputStreamTest();
	}

}
