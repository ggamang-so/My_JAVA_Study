
public class ContinueTest {

	public static void main(String[] args) {
		// continue는 만나는 즉시 아래 실행문은 건너뛰고 다시 조건문으로 돌아감
		for (int i=1; i<=10; i++) {
			if (i%2==1) {
				continue;
			}
			System.out.println(i); //  if 문에서 continue가 실행되면 이 명령문은 실행되지 않고 반복한다.
		}

	}

}
