import java.util.Calendar;
import java.util.Scanner;

public class ClassTest01 {
    // 멤버변수(member variable) field : 현재 클래스 내에서는 사용가능
    // 멤버변수는 초기값이 자동으로 설정된다.
    // 정수형(byte, short, int, long)은 0, 실수형(float, double)은 0.0 , 논리형(boolean)은 false
    // 배열, 클래스형(객체형)은 null이 초기값
    int num; // 0
    String name; // null
    String userId; //null
    Calendar now; //null
    int[] arr;  //null

    int dataNum = 1234;
    String myName = "이순신";
    Scanner scan = new Scanner(System.in);

    static {
        System.out.println("클래스를 실행하면 static 안에 있는 명령어들이 먼저 실행된다.");

    }

    // 메소드(method) - 다른 언어에서 함수(function) : 기능구현, 변수선언, 계산, 기본명령어(if, switch, for,
    // while ... 기술한다)
    // 				- 메소드를 생성하고 그 안에 기본 명령어 등을 사용할 수 있음, class선언 내부지만 메소드 밖에 사용하면 에러
    // 1. 생성자 메소드 :
    // 생성 규칙 	- 메소드명이 클래스 명과 같아야함.
    // 			- 반환형이 없다.
    // 			- 생성자 메소드는 여러개 만들수 있따. 단, 매개변수의 갯수나 데이터형이 달라야한다. 매개변수는 () 안의 데이터, 매개변수 이름은 달라도 안됨
    //			- 생성자 메소드를 만들지 않을 경우 컴파일러가 매개변수 없는 생성자를 자동으로 클래스에 넣어준다.
    // 			- 객체 생성시 1번 실행됨. new 생성자() 객체의 초기35값을 설정할 때 사용한다.

    public ClassTest01() {
        System.out.println("ClassTest01() 생성자 메소드 실행됨..");
    }

    public ClassTest01(int num) {
        int data; // 멤버변수와 달리 클래스 내에라도 이 객체 밖으로 나가면 사라짐;
        System.out.println("ClassTest01(int num) 생성자 메소드 실행됨.." + num);
    }

    public ClassTest01(String name) {
        System.out.println("ClassTest01(String name) 생성자 메소드 실행됨.." + name);
    }

    public ClassTest01(int num, String name) {
        // 멤버 번수에 지역변수값을 설정하기
        this.num = 888;//this 는 멤버변수와 지역변수가 같은 이름일때 멤버변수를 구별하기 위해서 사용
        System.out.println("ClassTest01(int num, String name) 생성자 메소드 실행됨.." + num + ", " + name + ", " + this.num + ", " + myName);
    }

    // 2. 메소드 : 기능구현
    //			- 필요한만큼 생성 가능. public은 생략 가능
    //			- 반환형은 메소드를 실행한 결과가 메소드 밖으로 내보내지는 형
    //			- 반환형 void : 변환값 없음
    //			- 반한
    //생성한다. 반환형. 메소드이름(매개변수){메소드 이름은 camel 표기법으로 명명
    //	}
    public void method1() {
        int a = 100;
        int b = 200;
        int c = a + b;
        System.out.println("c=" + c);

    }

    public String method2(int a, int b) {    // 안에서 실행문을 완료하고 c의 값을 결과물로 반환한다.
        int c = a + b;                    // 그래서 반환형에 c와 같은 데이터형인 int를 써주고
        return "c = " + c;                            // return 에 내보낼 변수 c를 입력해준다.
    }

    public String getMyName() {
        method1();
        method2(5, 6);
        return myName;
    }


}
