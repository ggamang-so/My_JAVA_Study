import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public FileReaderTest() {
		// 파일의 문자를 읽어 코솔(줄단위)출력

		try {
			File file = new File("F://java_test//InputStreamTest.java");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			while (true) { // BufferedReader에서 한줄씩 읽어오기)
				String line = br.readLine();

				if (line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException a) {

		}finally {
			System.out.println("end...");
		}

	}

	public static void main(String[] args) {
		new FileReaderTest();
	}

}
