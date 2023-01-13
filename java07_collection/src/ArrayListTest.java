import java.util.ArrayList;
import java.util.Scanner;

// ArrayList클래스 사용
//
public class ArrayListTest {
	
	public ArrayListTest() {}
	public ArrayList memberList() {
		// 회원 1명의 정보를 DTO에 셋팅하고 
		// DTO를 ArrayList에 추가하여 리턴해주는 메소드
		
		ArrayList memlist = new ArrayList();
		// .add(Object) : 마지막에 객체추가
		// .add(int , Object) : int 위치에 객체를 추가하고 int 위치에 객체가 있다면 뒤로 밀린다.
		memlist.add(new MemberDTO("hong","길동","010-1234-5678","hong@naver.com"));
		memlist.add(new MemberDTO());
		memlist.add(new MemberDTO("master","마스터","010-9876-5432"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("admin");
		dto.setUsername("관리자");
		dto.setEmail("admin@naver.com");
		
		memlist.add(dto);
		return memlist;
	}
	public ArrayList<MemberDTO> memberList2() {
		// 회원 1명의 정보를 DTO에 셋팅하고 
		// DTO를 ArrayList에 추가하여 리턴해주는 메소드
		
		// 컬렉션에 제너릭을 설정하면 컬렉션에 추가할 수 있는 객체의 타입을 지정할 수 있음
		ArrayList<MemberDTO> memlist = new ArrayList<MemberDTO>();
		// .add(Object) : 마지막에 객체추가
		// .add(int , Object) : int 위치에 객체를 추가하고 int 위치에 객체가 있다면 뒤로 밀린다.
		memlist.add(new MemberDTO("hong2","길동","010-1234-5678","hong@naver.com"));
		memlist.add(new MemberDTO());
		memlist.add(new MemberDTO("master2","마스터","010-9876-5432"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("admin2");
		dto.setUsername("관리자");
		dto.setEmail("admin@naver.com");
		
		
		memlist.add(dto);
//		memlist.add(new Scanner(System.in));
		//ArrayList 내 객체를 MemberDTO 로 한정해서 다른 타입은 추가할 수 없음.
		return memlist;
	}
}
