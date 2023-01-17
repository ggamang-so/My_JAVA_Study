import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public FileCopyTest() {
		//File에서 File로 쓰기(복사 붙여넣기)
		// FileInputStream
		
		try {
		File orgFile = new File("F://My_stories/img/1.jpeg");
		File tarFile = new File("F://java_test",orgFile.getName());
		
		FileInputStream fis = new FileInputStream(orgFile);
		FileOutputStream fos = new FileOutputStream(tarFile);
		
		
		//조금씩 옮기기보단 한번에 옮기는게 나으므로 byte[] 배열의 크기를 원본 파일 크기만큼의 크기로 생성
		byte[] inData = new byte[(int)orgFile.length()];
		int cnt = fis.read(inData, 0, inData.length);
		System.out.println("읽어온 바이트 수  = " + cnt + ", 배열의 길이 = " + inData.length);
		
		//쓰기
		fos.write(inData, 0, inData.length);
		fos.close();
		fis.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new FileCopyTest();	
		
		
	}

}
