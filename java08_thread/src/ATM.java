
public class ATM implements Runnable {

	int money = 20000;
	public ATM() {
		
	}
	// run() 메소드 오버라이딩
	// run() 메소드 동기화
	// 동기화(synchronized) : 한 스레드 실행중 다른 실행이 대기보드가 된다.
	// run()메소드 표기, run()메소드 내 일부만 동기화 가능
	// 일부만 동기화 하고 싶을때는 synchronized(){} 블록으로 묶어서 구분함
	public void run() {
		//1000원 씩 10번 연속 출금
		synchronized (this) {
		for (int i = 1; i<=10; i++) {
			withdraw(1000);
			if(money%2000 == 0) { // 잔액이 2000의 배수일 때 
				try {
					this.wait();
				} catch (InterruptedException ie) {

				}		//동기화 해제
			}else {// 잔액이 2000 배수가 아니면 
				    this.notify();   // 다시 동기화
			}
		}
		}
	}
	public void withdraw(int cash) {// 출금처리 메소드
		if(money >= cash) {
			money -= cash;
			System.out.println(Thread.currentThread().getName() + "출금, 잔액 =" + money + "원");
				
		}
	}

	public static void main(String[] args) {
		ATM atm  = new ATM();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		son.setPriority(Thread.MAX_PRIORITY);
		mother.start();
		son.start();
		
	}

}
