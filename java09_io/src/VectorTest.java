import java.io.Serializable;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest implements Serializable{ 
	String msg = "객체로 잘 만들기";
	public VectorTest() {
	}

	public Vector getData() {
		
		//컬렉션은 객체를 저장하고 보관하는 기능을 가진 클래스
		//컬렉션은 다양한 타입의 객체를 저장할수 있음
		// vector는 순서유지, index, 중복객체 저장됨 -> add(int index, 객체) 이렇게 넣으면 특정 부위에 들어가고 한칸씩 뒤로 밀림
		
		Vector vector = new Vector(3);
		String name = "홍길동22";
		int age = 55;
		Calendar now = Calendar.getInstance();
		now.set(2024, 11, 22);
		Random random = new Random();
		MemberDTO mem = new MemberDTO("ioBest","아이오베스트","010-3333-4444");
		
		vector.add(name);  // 0
		vector.add(age);   // 1  
		vector.addElement(now); // 2
		vector.addElement(mem); // 3
		vector.addElement("세종대왕"); // 4
		
		System.out.println("capacity = " + vector.capacity());
		
		return vector;
		
		
	}
}
