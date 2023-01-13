import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {
	}

	public Vector getData() {
		
		//컬렉션은 객체를 저장하고 보관하는 기능을 가진 클래스
		//컬렉션은 다양한 타입의 객체를 저장할수 있음
		// vector는 순서유지, index, 중복객체 저장됨 -> add(int index, 객체) 이렇게 넣으면 특정 부위에 들어가고 한칸씩 뒤로 밀림
		
		Vector vector = new Vector(3);
		String name = "홍길동";
		int age = 25;
		Calendar now = Calendar.getInstance();
		now.set(2020, 10, 25);
		Random random = new Random();
		MemberDTO mem = new MemberDTO("best","베스트","010-3333-4444");
		
		vector.add(name);  // 0
		vector.add(age);   // 1  ->  2
		vector.addElement(now); // 2 -> 3
		vector.add(1,random);// 1
		vector.addElement(mem); // 4
		
		vector.set(2, 35); // 2
		vector.setElementAt("세종대왕", 0); // 0
		
		System.out.println("capacity = " + vector.capacity());
		
		return vector;
		
		
	}
}
