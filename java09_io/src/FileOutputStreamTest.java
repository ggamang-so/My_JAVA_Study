import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public FileOutputStreamTest() {
		//FileOutputStream 으로 쓰기 : byte단위로 파일 쓰기

		try {
			File f1 = new File("F://java_test", "my_data.txt");
			FileOutputStream fos = new FileOutputStream(f1);
			String[] inData = {"자바에서 문자열을\n","파일로 쓰기 연습중\n","FileOutputStream 객체 \n"};
			for (String data : inData) {
				fos.write(data.getBytes());

			}
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException a) {
			
		}

	}

	public static void main(String[] args) {
		new FileOutputStreamTest();
	}

}
