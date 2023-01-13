import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;


public class LottoWithCollection {

	Scanner scan = new Scanner(System.in);
	int game;
	int bonus;
	String result;
	public int games() {
		System.out.print("몇판 하시겠습니까?");
		
		return scan.nextInt();
		
	}
	public TreeSet<Integer> lottoNum(){ 
		// 번호 6개와 마지막 보너스 번호 
		TreeSet<Integer> lottoNum = new TreeSet<Integer>();
		
		while (true) {
			Random ran = new Random();
			int num = ran.nextInt(45)+1;
			lottoNum.add(num);
			
			if (lottoNum.size()==7) {
				bonus = num;
				lottoNum.remove(num);
				break;
			}
		}
		return  lottoNum;
	}
	public void printResult(TreeSet<Integer> lottoNum) {
		String numbers ="";
		Iterator<Integer> ln = lottoNum.iterator();

		while(ln.hasNext()) {
			numbers += ln.next()+", ";
		}
//		result = numbers + "bonus ="+bonus;
		System.out.printf("[%s], bonus = %d", numbers, bonus);
		
	}

	
	public LottoWithCollection() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
			game = games();
			for (int i = 1; i<=game; i++) {
			System.out.printf("%d게임 = ", game);
			printResult(lottoNum());
			System.out.println();
		}
	
		
		
	}

	public static void main(String[] args) {
		LottoWithCollection lwc = new LottoWithCollection();
		lwc.start();

	}

}
