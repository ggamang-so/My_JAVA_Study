import java.util.Scanner;

public class LinkedListMain {

	public LinkedListMain() {}
	public LinkedListMain start() {
		Scanner scan = new Scanner(System.in);
		LinkedListTest llt = new LinkedListTest();
		
		do {
			try {
			System.out.print("메뉴선택[1:In, 2:Out]");
			//1-> PersonDTO객체를 만들어 LinkedList에 추가
			//2-> LinkedList에서 제일 앞에 있는 객체를 꺼내기
			int menu = scan.nextInt();
			switch(menu) {
			case 1: llt.inGuest(); break;
			case 2: llt.outGuest(); break;
			default:
				System.out.println("메뉴를 잘못 입력하였습니다.");
			
			}
		}catch(Exception e) {
			System.out.println("메뉴를 다시 입력해 주세요");
		}
		}while(true);
		
	}
	public static void main(String[] args) {

		LinkedListMain llm = new LinkedListMain().start();

	}

}
