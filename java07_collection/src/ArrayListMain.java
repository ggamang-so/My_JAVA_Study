import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMain {

	public ArrayListMain() {}
	public void start() {
		
		ArrayListTest alt = new ArrayListTest();
		ArrayList al = alt.memberList();
		System.out.println("**************/ArrayList 각 객체 출력/***************");
		for (int i=0; i<al.size();i++) {
			MemberDTO dto = (MemberDTO)al.get(i);
			System.out.printf("%s \t %s \t %-13s \t %s\n",dto.getUserid(),
					dto.getUsername(), dto.getTel(), dto.getEmail());
		}
		System.out.println("**************/toArray로 만들어서 출력/***************");
		Object[] memObj = al.toArray();
		for (Object m:memObj) {
		MemberDTO dto = (MemberDTO)m;
		System.out.println(dto.toString());
		}
		System.out.println("**************/for확장 문 써서 출력/***************");
		for(Object m : al ) {
			MemberDTO dto = (MemberDTO)m;
			System.out.printf("%s \t %s \t %s \t %s\n",dto.getUserid(),
					dto.getUsername(), dto.getTel(), dto.getEmail());
		}
		System.out.println("**************/제너릭으로 객체 타입 한정해서 for확장문으로 출력/***************");
		ArrayList<MemberDTO> al2 = alt.memberList2();
		for(MemberDTO m : al2) { // ArrayList 내 객체를 MemberDTO로 한정해서 변수도 
								 // MemberDTO로 해주면 되고 따로 형변환도 안해도 됨
			System.out.println(m.toString());	
		}
		System.out.println("**************/제너릭으로 객체 타입 한정해서 출력/***************");		
		for (int i=0;i<al2.size();i++) {
			MemberDTO m = al2.get(i);
			System.out.println(m.toString());	
			
		}
		
	}
	
	public static void main(String[] args) {
		new ArrayListMain().start();

	}

}
