// 스레드 처리 클래스 생성
// 1. 인터페이스 Runnalbe을 상속 받는다 .
public class ThreadTest02 implements Runnable {
	String msg;
	int i=0;
	public ThreadTest02() {

	}
	public ThreadTest02(String msg) {
		this.msg = msg;
	}
	
	//2. 인터페이스 Runnable의 추상메소드 run() 오버라이딩
	@Override
	public void run() {
		while(true) {
			System.out.println(msg + " ====> " + ++i +"____"+ Thread.currentThread().getName());
			
		}
	}



	public static void main(String[] args) {
		// 인터페이스 Runnable을 상속받아 run()메소드를 오버라이딩한경우
		// Runnable에는 start()가 없기 때문에 해당 클래스를 객체 생성한 후 
		// Thread(Runnable target, String name) 생성자로 Thread클래스를 객체생성하여야 한다. 
		ThreadTest02 tt1 = new ThreadTest02("first");
		Thread t1 = new Thread(tt1, "첫번째");
		ThreadTest02 tt2 = new ThreadTest02("second");
		Thread t2 = new Thread(tt2, "두번째");
		ThreadTest02 tt3 = new ThreadTest02("third");
		Thread t3 = new Thread(tt3, "세번째");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
