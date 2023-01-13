package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

    public ExceptionTest1() {
        // TODO Auto-generated constructor stub
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("첫번째수 = ");
            int num1 = scan.nextInt();
            System.out.print("두번째수 = ");
            int num2 = scan.nextInt();

            int hap = num1 + num2;
            int cha = num1 - num2;
            int mul = num1 * num2;
            int div = num1 / num2;

            System.out.printf("%d + %d = %d \n", num1, num2, hap);
            // printf     %d 정수   %10d 는 10자리 확보하고 오른쪽 정렬로 %-10d 는 10자리 확보하고 왼쪽정렬로
            //   		  %f 실수   %7.2f 는 총 7자리확보하고 소숫점 2자리 표현--> 정수부 4자리, 소수점 1자리, 소수점 뒤로 2자리
            System.out.printf("%d - %d = %d \n", num1, num2, cha);
            System.out.printf("%d * %d = %d \n", num1, num2, mul);
            System.out.printf("%d / %d = %d \n", num1, num2, div);

            int[] data = {10, 20, 30};
            System.out.println("배열 = " + data[data.length - 1]);

        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력하세요.");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ArithmeticException a) {
            System.out.println("두번째 숫자에 0을 입력하지 마세요.");
            a.printStackTrace();
            System.out.println(a.getMessage());
        } catch (ArrayIndexOutOfBoundsException aioe) {
            System.err.println(aioe.getMessage());
        } finally {
            System.out.println("무조건 실행됨");
        }


    }

    public static void main(String[] args) {
        new ExceptionTest1().start();
    }

}
