import java.util.Calendar;
import java.util.Scanner;

public class CalendarObjectTeacher {

    public CalendarObjectTeacher() {
    }

    public void start() {
        int year = inputData("년도");
        int month = inputData("월");
        int week = getWeek(year, month);
        int lastDay = getLastDay(year, month);
        titlePrint(year, month);
        spacePrint(week);
        dayPrint(lastDay, week);

    }

    public void start2(int y, int m) {
        int w = getWeek(y, m);
        int lastDay = getLastDay(y, m);
        titlePrint(y, m);
        spacePrint(w);
        dayPrint(lastDay, w);
    }

    public int inputData(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.print(msg + " = ");
        return scan.nextInt();

    }

    public int getWeek(int year, int month) {
        Calendar now = Calendar.getInstance();
        now.set(year, month - 1, 1);
        return now.get(Calendar.DAY_OF_WEEK);

    }

    public int getLastDay(int year, int month) {

        int lastDay = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 30;
                break;
            case 2:
                // 연도가 4의 배수이고 100으로 나눠지지 않아야 한다.
                // 400의 배수의 해는 윤년

                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//윤년
                    lastDay = 29;
                } else {//평년
                    lastDay = 28;
                }
        }
        return lastDay;
    }

    public void titlePrint(int year, int month) {
        System.out.println("\t\t\t" + year + "년 " + (month) + "월");
        weekTitle();
    }

    public void weekTitle() {
        System.out.println("일\t월\t화\t수\t목\t금\t토");
    }

    public void spacePrint(int week) {
        for (int space = 1; space < week; space++) {
            System.out.print(" \t");
        }
    }

    public void dayPrint(int lastDay, int week) {
        for (int day = 1; day <= lastDay; day++) {
            System.out.print(day + "\t");
            if ((week - 1 + day) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
