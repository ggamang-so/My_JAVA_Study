import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
	
	public HashMapTest() {}
	public void start() {
		// HashMap
		// 1.HashMap은 키(Key)와 벨류(value)를 가진다
		// 2.키(Key)는 중복될 수 없다. 
		// 3.
		HashMap<String, MemberDTO> hm = new HashMap();
		
		hm.put("홍길동", new MemberDTO("go", "고구", "010-7984-5875"));
		
		MemberDTO dto = new MemberDTO();
		dto.setUserid("guest");
		dto.setUsername("손님");
		dto.setTel("010-4887-0513");
		hm.put("손님", dto);
		
		hm.put("세종대왕", new MemberDTO("king","세종대왕","010-1111-2222"));
		hm.put("안중근", new MemberDTO("an","안중근","010-3213-2544"));
		
		// 같은 키로 데이터를 put 하면 덮어쓰기된다.
		
		hm.put("안중근", new MemberDTO("an2","안중근2","111-3213-2544"));
		
		//Map컬렉션에서 객체 얻어오기
		System.out.println(hm.get("안중근"));
		
		
		//모든키 얻어오기
		Set<String> keyList = hm.keySet();
		Iterator<String> ii = keyList.iterator();
		System.out.println("*******KEY를 이용해 value 다꺼내기*********");
		while(ii.hasNext()) {
			MemberDTO dto2 = hm.get(ii.next());
			System.out.println(dto2.toString());
		}
		
		// 모든 value 얻어오기
		Collection<MemberDTO> valueList = hm.values();
		Iterator<MemberDTO> iii = valueList.iterator();
		System.out.println("*******value 를 이용해 value 다꺼내기*********");
		while(iii.hasNext()) {
	
			System.out.println(iii.next().toString());
		}
 		
		
	}
	
	public static void main(String[] args) {
		HashMapTest hmt = new HashMapTest();
		hmt.start();
	}

}
