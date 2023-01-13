import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PersonDTO {
	private int num;
	private Calendar dateTime;
	private int waitingCount;
	
	
	public String toString() {// 대기표에 찍히는 것
		String message = "";
		message += "번호 : " + num + "\n";
		
		//SimpleDateFormat 클래스를 이용하여 날짜를 원하는 패턴으로 만들 수 있다. 
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (E)");
		
		// 날짜를 패턴에 적용
		String dateTimeStr = dFormat.format(dateTime.getTime());
		message += "현재시간 : " + dateTimeStr + "\n";
		
		// 대기열에 남아있는 객체수 
		// LinkedListTest.watingList.size()
		message += "대기인수 : " + waitingCount;
//		System.out.println(message);
		
		
		
		/*
		 번호 : 5
		 현재시간 : 2023-01-12 03:15:16(목)
		 대기인수 : 3명
		*/
		return message;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Calendar getDateTime() {
		return dateTime;
	}

	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

	public int getWaitingCount() {
		return waitingCount;
	}

	public void setWaitingCount(int waitingCount) {
		this.waitingCount = waitingCount;
	}

	public PersonDTO() {

	}

}
