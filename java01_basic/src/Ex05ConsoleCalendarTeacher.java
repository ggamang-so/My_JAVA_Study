import java.util.Calendar;
import java.util.Scanner;

public class Ex05ConsoleCalendarTeacher {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 = ");
		int year = scan.nextInt();
		System.out.print("월 = ");
		int month = scan.nextInt();
		now.set(year, month-1, 1);
//		int lastDate = now.getActualMaximum(Calendar.DAY_OF_WEEK);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		
		int lastDay = 31;
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30; break;
		case 2:
			// 연도가 4의 배수이고 100으로 나눠지지 않아야 한다. 
			// 400의 배수의 해는 윤년
			
			if(year%4==0 && year%100!=0 || year%400 ==0) {//윤년
				lastDay = 29;
			}else {//평년
				lastDay = 28;
			}
		}
		System.out.println("\t\t\t"+year+"년 "+(month)+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int space=1; space<week; space++) {
			System.out.print(" \t");
		}
		for(int day=1; day<=lastDay; day++) {
			System.out.print(day+"\t");
			if ((week-1+day)%7==0) {
				System.out.println();
			}
		}

	}

}
