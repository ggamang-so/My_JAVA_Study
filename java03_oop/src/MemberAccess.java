
public class MemberAccess {
	String id = "gga";
	String name = "이현우";
	String tel = "010-9876-5432";
	String email = "gga@naver.com";
	
	
	public MemberAccess() {
		// TODO Auto-generated constructor stub
	}
	public MemberDTO getMember() {
		MemberDTO dto = new MemberDTO();
		dto.setUserid(id);
		dto.setUsername(name);
		dto.setTel(tel);
		dto.setEmail(email);
		return dto;
	}
	public MemberDTO[] getAllMember() {
		MemberDTO m1 = new MemberDTO();
		m1.setUserid("java");
		m1.setUsername("홍길동");
		m1.setTel("010-4567-2584");
		MemberDTO m2 = new MemberDTO("master", "마스터", "010-7777-8888");
		MemberDTO m3 = new MemberDTO("admin", "관리자", "010-2222-3333");
		
		//배열에 MemberDTO담기
		MemberDTO[] member = new MemberDTO[3];
		member[0] = m1;
		member[1] = m2;
		member[2] = m3;
		return member;
	}
}
