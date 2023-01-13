//캡슐화된 멤버변수와 getter, setter  메소드가 있는 데이터를 저장할 수 있는 클래스
// 회원정보(아이디, 비밀번호, 이름, 연락처, email, 주소, 취미, 관심분야..)
//상품정보(상품명, 가격, 컬러, 사이즈, 할인율...)
//DTO클래스(Data Transfer Object) - setter를 이용하여 데이터 변경 가능
//VO클래스(Value Object) - readonly 전용 
public class MemberDTO {
	//캡슐화 변수
	private String userid; //null
	private String userpw; //null
	private String username; // null
	private String tel;
	private String email;
	

	public MemberDTO() {

	}
	
	public MemberDTO(String userid, String username, String tel) {
		this.userid = userid;
		this.username = username;
		this.tel = tel;
	}
	
	
	
	// 우클릭 -> source -> generate toString
	@Override // 상위 클래스 Object의 toSring이기 때문에 override 표시
	public String toString() {
		return "MemberDTO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", tel=" + tel
				+ ", email=" + email + "]";
	}

	//getter
	public String getUserid() {
		return userid;
	}
	//setter
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



}
