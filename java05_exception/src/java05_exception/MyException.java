package java05_exception;

public class MyException extends Exception {
	// 예외 클래스 생성 규칙
	// 1. 클래스 명은 마지막에 Exception이 들어가야한다.
	// 2.  API의 Exception 또는 RuntimeException 클래스 중 1개를 상속 받아야 한다.
	public MyException() {
		super("1~100사이의 값을 입력해주세요.");
		

	}
	public MyException(String message) {
		super(message);
	}

}
