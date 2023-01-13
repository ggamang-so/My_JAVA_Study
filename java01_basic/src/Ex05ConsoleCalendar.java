import java.util.Calendar;
import java.util.Scanner;

public class Ex05ConsoleCalendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 = ");
		int year = scan.nextInt();
		System.out.print("월 = ");
		int month = scan.nextInt() - 1;
		now.set(year, month, 1);
		int lastDate = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		int weekDate = now.get(Calendar.DAY_OF_WEEK);

		System.out.println("\t\t\t" + year + "년 " + (month + 1) + "월");
		int weekNum;
		if ((weekDate + lastDate) % 7 == 0) {
			weekNum = (weekDate + lastDate) / 7 + 1;
		} else {
			weekNum = (weekDate + lastDate) / 7 + 2;
		}
		int num = 1;
		label: for (int i = 1; i <= weekNum; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1) {
					String weekStr = "";
					switch (j) {
					case 1:
						weekStr = "일";
						break;
					case 2:
						weekStr = "월";
						break;
					case 3:
						weekStr = "화";
						break;
					case 4:
						weekStr = "수";
						break;
					case 5:
						weekStr = "목";
						break;
					case 6:
						weekStr = "금";
						break;
					case 7:
						weekStr = "토";
					}

					System.out.print(weekStr + "\t");

				} else if (i == 2) {
					if (j < weekDate) {
						System.out.print(" \t");
					} else {
						System.out.print(num + "\t");
						num += 1;
					}

				} else {

					if (num == lastDate) {
						System.out.print(num + "\t");
						break label;
					} else {
						System.out.print(num + "\t");
						num += 1;

					}

				}

			}
//			
			System.out.println();
		}
	}
}
