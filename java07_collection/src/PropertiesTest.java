import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public PropertiesTest() {
		// key와 value를 문자열로만 처리하는 컬렉션이다.
		Properties pro = new Properties();
		
		//객체 추가			"KEY"				"Value"
		pro.setProperty("/seoul/index.do", "/index.jsp");
		pro.setProperty("/test.do", "/dboard/boardList.jsp");
		pro.setProperty("111111", "AAAAAA");
		pro.setProperty("222222", "BBBBBB");
		
		// 값 가져오기
		System.out.println(pro.getProperty("/test.do"));
		System.out.println(pro.getProperty("/notice.do", "/error.jsp")); // 앞의 키 값이 없으면 뒤에 문자열을 반환해라
		
		// 모든 키 목록 구하기 
		Enumeration keyList = pro.propertyNames();
		while(keyList.hasMoreElements()) {
			String key = (String)keyList.nextElement();
			String value = pro.getProperty(key);
			System.out.println(key + " => " + value);
		}
	}

	public static void main(String[] args) {
		new PropertiesTest();
	}

}
