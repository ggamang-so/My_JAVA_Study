import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		
		
		TreeMap<String, MemberDTO> tm = new TreeMap();
		
		tm.put("홍길동", new MemberDTO("hong","홍길동","010-1111-1111"));
		tm.put("이순신", new MemberDTO("lee","이순신","010-2222-2222"));
		tm.put("세종대왕", new MemberDTO("king","세종대왕","010-3333-3333"));
		tm.put("강감찬", new MemberDTO("kang","강감찬","010-4444-4444"));
		tm.put("안중근", new MemberDTO("an","안중근","010-5555-5555"));
		
		System.out.println("*********************************Key 목록을 구하여 전체 출력 ***************************");
		
		Set<String> keyList = tm.keySet();
		System.out.println(keyList.toString());
		
		System.out.println("*********************************Key 목록을 구하여 전체 출력 ***************************");
		Collection<MemberDTO> valueList = tm.values();
		System.out.println(valueList.toString());
		
		Object[] objList = valueList.toArray();
		for (Object o : objList) {
			MemberDTO dto = (MemberDTO)o;
			System.out.println(dto.toString());
		}
	}
	public static void main(String[] args) {
		new TreeMapTest().start();

	}

}
