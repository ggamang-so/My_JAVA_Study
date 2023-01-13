import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	double data[] = {12.5, 56.3, 9.6, 41.2, 10.9, 12.5, 56.3, 9.6, 10.9};
	
	public HashSetTest() {

	
	}
	public void start() {
		// hashSet
		// Set 인터페이스를 상속받음
		// 저장순서를 유지하지 않음
		// 중복 데이터를 허용안함
		
		HashSet<Double> hs = new HashSet<Double>();
		
		for (double d: data) {
			hs.add(d);
		}
		
		//Hashset에서 객체 꺼내기
		Iterator<Double> i = hs.iterator();
		
		while(i.hasNext()) {
			double num = i.next();
			System.out.print(num+"\t");
		}
		
		
	}

	public static void main(String[] args) {
		HashSetTest hst = new HashSetTest();
		hst.start();
	}

}
