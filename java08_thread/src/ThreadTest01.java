// 스레드 처리되는 클래스 생성하기
// 1. Thread 클래스 상속
// 2. 스레드 처리할 실행문을 run() 메소드에 오버라이딩하여 구현한다. 
// 3. start()메소드를 이용하여 자바가상머신의 스레드스케쥴러에 등록한다. 
public class ThreadTest01 extends Thread {
	String msg;
	public ThreadTest01() {
		
	}
	public ThreadTest01(String msg) {
		this.msg = msg;
	}
	public void run() { // 객체.run()이 아니라 객체.start()로 시작하며 스레드스케쥴러에 등록됨
		for (int i=1;;i++) {
			System.out.println(msg +  "-->" + i + "___" + Thread.currentThread().getName());
			try {
			Thread.sleep(200);
			}catch(InterruptedException ie) {}
		}
	}

	public static void main(String[] args) {
		ThreadTest01 tt1 = new ThreadTest01("첫번째");
		ThreadTest01 tt2 = new ThreadTest01("두번째");	
		ThreadTest01 tt3 = new ThreadTest01("세번째");	
		
		tt1.start();
		tt2.start();	
		tt3.start();	
	}

}
