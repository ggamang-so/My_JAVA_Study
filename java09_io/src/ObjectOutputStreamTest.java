import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

	public ObjectOutputStreamTest() {
		try {
			//ObjectOutputStream : 객체를 쓰기 할 수 있는 클래스
			
			File f = new File("F://java_test/Object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			VectorTest vt = new VectorTest(); // Serializable 의 객체를 선택해야함
			vt.msg = "ObjectOutputStream을 이용한 객체 파일로 기록하기";
			oos.writeObject(vt);
			
			oos.close();
			fos.close();
			System.out.println("객체쓰기 완료");
					
			
			
			
		}catch(Exception e) {
			
		}
	
	}

	public static void main(String[] args) {
		new ObjectOutputStreamTest();
	}

}
