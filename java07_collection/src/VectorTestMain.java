import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {
	
	public VectorTestMain() {
		
	}
	public void start() {
		VectorTest vt = new VectorTest();
		Vector vec = vt.getData();
		
		String name = (String) vec.get(0);
		Random ran = (Random) vec.get(1);
		int age = (int)vec.get(2);
		Calendar cal = (Calendar) vec.get(3);
		MemberDTO mem = (MemberDTO) vec.get(4);
		
		System.out.println("name = " + name);
		System.out.println("ran = " + ran.nextInt(400));
		System.out.println("age = " + age);
		System.out.printf("%d-%d-%d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(mem.toString());
		System.out.println(vec.size());
		vec.remove(3);
		System.out.println(vec.size());
	}

	public static void main(String[] args) {
		new VectorTestMain().start();
		
		
	}

}
