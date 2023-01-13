import java.util.Calendar;
import java.util.Scanner;

public class CalendarObject {

    public int input(String target) {
        Scanner scan = new Scanner(System.in);
        System.out.print(target + " = ");
        int d = scan.nextInt();
        return d;
    }


    public void calendarDraw(int lastDate, int weekDate) {
        for (int i = 1; i <= lastDate; i++) {
            System.out.print(i + "\t");
            if ((i + weekDate - 1) % 7 == 0) {
                System.out.println();
            }

        }
    }

    public void emptyDay(int weekDate) {
        System.out.println();
        for (int i = 1; i < weekDate; i++) {
            System.out.print(" \t");
        }
    }

    public void date() {
        for (int i = 1; i <= 7; i++) {
            String weekStr = "";
            switch (i) {
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
        }
    }

    public static void main(String[] args) {
        CalendarObject cal = new CalendarObject();
        int year = cal.input("year");
        int month = cal.input("month") - 1;
        Calendar now = Calendar.getInstance();
        now.set(year, month, 1);
        System.out.println("\t\t   " + year + "년 " + (month + 1) + "월");
        cal.date();
        int lastDate = now.getActualMaximum(Calendar.DAY_OF_MONTH);
        int weekDate = now.get(Calendar.DAY_OF_WEEK);

        cal.emptyDay(weekDate);
        cal.calendarDraw(lastDate, weekDate);


    }


    // 조건 : 멤버변수 없이

}
