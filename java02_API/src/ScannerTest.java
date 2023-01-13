import java.lang.String;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        // Scanner : 실행중에 콘솔에서 정수, 실수, 논리, 문자열 데이터를 입력받는 기능을 갖는다.
        // 1. 객체 : 클래스 사용을 위해서 객체를 생성
        // --> 클래스의 생성자 메소드 'new'를 클래스 명 앞에 붙인다.
        //

        //하단에 사용할 클래스를 가저오는 명령어

        Scanner scan = new Scanner(System.in); // Scanner 클래스를 사용해서 새로운 객체를 만들어 scan 변수에 담는다.
        // instance 변수, reference 변수 -> 클래스로 만든 변수로 하나의 데이터가 아니라 객체가 담김

        //프로그램 실행중 값을 입력받기
        //1. 정수
        // 객체명.메소드명
        System.out.print("숫자입력=");
        int num = scan.nextInt();
        // 정수 입력 : nextByte(), nextShort(), nextInt(), nextLong()
        // 실수 입력 : nextFloat(), nextDouble
        // 논리 입력 : nextBoolean()
        // 문자 입력 : nextLine()
        System.out.println("입력받은 값 = " + (num + 10));
        double num2 = scan.nextDouble();


    }

}
