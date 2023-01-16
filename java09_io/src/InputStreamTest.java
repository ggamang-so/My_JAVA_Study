

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamTest{

	public InputStreamTest() {
		// InputStream :  InputStream은 추상메소드를 포함한 추상클래스 이므로 
		// 				  상속을 받아서 추상 메소드를 오버라이딩 해서 써야한다.
		//				  System.in필드에 객체가 생성되어 있다. 
		
		InputStream is = System.in;
		try {
			while(true) {
//			int code = is.read(); // 사용자가 값(문자)를 입력 후 enter입력시까지 기다리다 
//								 	// 입력 완료 후 enter치면 입력한 값의 1byte를 가져온다
//									// 입력후 값이 없을 때 -1 반환
//			if (code==-1) {break;}
//			System.out.println("code = "+(char)code); // 출력하면 입력값의 아스키코드로 출력해준다.
									// read에서 엔터를 치면 엔터의 아스키코드 13과 10이 같이 입력된다.
			//read(byte[])) : 한번에 바이트 배열 크기만큼 읽어오기
				byte[] data =new byte[10];
				int cnt = is.read(data); // 몇 바이트 읽었는지 반환
				System.out.println(Arrays.toString(data));
				System.out.println("cnt => "+ cnt);
				System.out.println(new String(data, 0, 6)+"******************");
				//byte배열의 값을 문자열로 변환해서한 출력하기
				//
				
				
				
			}
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		new InputStreamTest();
	}

}
