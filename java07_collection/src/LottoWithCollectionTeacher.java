import java.util.*;

public class LottoWithCollectionTeacher {
	// 멤버변수
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	int bonus;

	public LottoWithCollectionTeacher() {

	}

	public void gameStart() {
		do {
			int cnt = gameCount();
			for (int i = 1; i <= cnt; i++) {
			System.out.print(i + "게임 = ");
			printGame();
			}
			if(!repeatGame()) { // 값이 true가 오면 게임계속 // false가 오면 게임종료
				System.out.println("게임을 종료합니다.");
				break;
			}
		}while(true);
	}

	// 번호 생성
	public int[] createLotto() { // 원래 트리셋으로 했다가 버블정렬하면서 트리셋안쓰고 하는걸로 수정
		// 번호 6개와 보너스 번호
//		TreeSet<Integer> lottoNum = new TreeSet<Integer>();
		int[] nums = new int[7];
		int[] lottoNum = new int[6];
		for (int i = 0; i < nums.length; i++) {
			int num = random.nextInt(45) + 1;
			nums[i] = num;
			for (int j = 0; j < i; j++) {
				if(nums[j] == nums[i]) {
					i--;
					break;
				}
			}
		}
		bonus = nums[6];
		lottoNum = Arrays.copyOfRange(nums, 0,6);
		for (int k = 0; k < lottoNum.length-1; k++) {
			for (int h = 0; h < lottoNum.length-1-k; h++) {
				if(lottoNum[h] > lottoNum[h+1]){
					int temp = lottoNum[h];
					lottoNum[h] = lottoNum[h+1];
					lottoNum[h+1] = temp;
				}

			}
		}
		return lottoNum;

	}

	public void printGame() {

		System.out.println(Arrays.toString(createLotto()) + " bonus = " + bonus);
	}

	// 게임 추가 진행 여부
	public boolean repeatGame() {
		do {
			// y, Y : 예
			// n, N : 아니오
			// 그외 : 다시질문
			System.out.print("계속하시겠습니까? (y or Y = 예, n or N = 아니오)");
			String yn = scan.nextLine();
			if (yn.equalsIgnoreCase("y")) {
				return true;
			} else if (yn.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.println("잘못입력하셨습니다.다시 입력해주세요.");
			}

		} while (true);

	}

	// 게임수 입력
	public int gameCount() {
		do {
			try {
				System.out.print("몇판하시겠습니까?");
				String cntString = scan.nextLine();
				int cnt = Integer.parseInt(cntString);

				// 게임수의 최대, 최소값 범위확인
				if (cnt >= 1 && cnt <= 10) {
					return cnt;
				} else {
					System.out.println("게임수는 1~10까지만 가능합니다.");
				}

			} catch (NumberFormatException nnf) {
				System.out.println("게임수는 숫자여야 합니다.");
			}

		} while (true);
	}

	public static void main(String[] args) {
		LottoWithCollectionTeacher lwc = new LottoWithCollectionTeacher();
		lwc.gameStart();

	}

}
