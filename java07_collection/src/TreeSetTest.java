import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {}
	public void start() {
		String[] data = {"자바", "java", "JAVA", "스프링", "spring", "ajax", "1234", "자바", "스프링"};
		
		//TreeSet 컬렉션
		//저장순서를 유지하지 않는다.
		// 오름차순으로 정령된다.
		// 중복허용안함
		
		TreeSet<String> ts = new TreeSet();
		
		for (int i=0; i<data.length;i++) {
			ts.add(data[i]);
		}
		
		System.out.println("객체수 = "+ ts.size());
		
		// 오름차순으로 정령하여 Iterator객체로 리턴해준다.
		Iterator<String> ii = ts.iterator();
		while (ii.hasNext()) {
			System.out.print(ii.next()+"\t");
		}
		System.out.println();
		// 내림차순으로 정령하여 Iterator객체로 리턴해준다.
		Iterator<String> id = ts.descendingIterator();
		while (id.hasNext()) {
			System.out.print(id.next()+"\t");
		}
		System.out.println();
		String first = ts.first();
		System.out.println("first = "+ first);
	}
	
	public static void main(String[] args) {
		TreeSetTest tst = new TreeSetTest();
		tst.start();
	}

}
