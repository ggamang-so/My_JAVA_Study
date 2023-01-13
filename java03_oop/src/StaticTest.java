
public class StaticTest {

    // static 은 멤버변수, 메소드에 표기한다.
    // 멤버변수에 static 을 쓰면, 데이터형 왼쪽에 기술하고
    // 멤버변수를 접근할 때, 객체를 생성하지않고 클래스명.멤버변수로 접근이 가능하다.
    // 객체를 여러개 만들더라도 static 변수는 1개만 존재한다. 싱글톤

    int num = 10;
    String name = "홍길동";
    static String local = "강남구";


    public static void testMethod() {
        System.out.println("ㅣㅐㅊ미 = " + local);  // static method에서 사용한 멤버변수는 반드시 static 변수만 있어야 함. 지역변수는 만들어도 괜찮음
        // 같은 클래스 static 변수이므로 클래스명 생략가능하다.
    }

    public void print() {
        System.out.println("num = " + num);
    }


    public static void main(String[] args) {

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();
        st2.local = "영등포구";

        System.out.println("st1 = > " + st1.local);
        System.out.println("st3 = > " + st3.local);
        System.out.println("local = " + StaticTest.local);

        System.out.println("pi = > " + Math.PI);

        st1.print();
        StaticTest.testMethod(); // testMethod()는 static 메소드 이므로 1개만 존재하고,객체를 생성하지 않고도 클래스명.메소드명으로 호출할 수 있다.
    }

}

class Test01 {

}

class Test02 {

}
