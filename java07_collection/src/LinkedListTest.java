import java.util.Calendar;
import java.util.LinkedList;

public class LinkedListTest {

	public static int count = 1;
	// 번호표를 뽑으면 PersonDTO객체를 만들어 Queue에 추가한다.
	
	public static LinkedList<PersonDTO> waitingList = new LinkedList<PersonDTO>();
	public void inGuest() {
		//PersonDTO 객체를 만들어 
		PersonDTO  person = new PersonDTO();
		
		// 1. num의 dto추가 num은 1 증가
		person.setNum(count++);
		// 2. 현재 날짜와 시간을 dto 객체에 추가
		person.setDateTime(Calendar.getInstance());
		// 3. 대기인수 waitingList 사이즈로 구함
		person.setWaitingCount(waitingList.size());
		// 4. 출력
		System.out.println(person.toString());
		
		//대기열에 추가
		waitingList.offer(person);
	}
	public void outGuest() {
		// 제일 앞 객체를 꺼내고 지워짐
		waitingList.poll();
		System.out.println("남은 객체수 = "+ waitingList.size());
	}
	
	public LinkedListTest() {
		
		
	}

}
