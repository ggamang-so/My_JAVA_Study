package innerclass;

public class OuterClass {

    int productNo = 1234;
    String productName = "컴퓨터";

    public OuterClass() {
        System.out.println("OuterClass()생성자");

    }

    public void productList() {
        System.out.println("상품번호 = " + productNo);
        System.out.println("상품명 = " + productName);
    }

    public void createInner() {
        // 내부클래스 객체를 외부클래스의 영역에서 사용할 때는 내부 클래스 객체를 외부클래스를 이용하지 않고 생성할 수 있다.
        InnerClass i1 = new InnerClass();
        i1.memberOutput();
    }
    //내부클래스란
    // 클래스 내에 선언한 클래스
    // 1. 클래스 영역에 내부클래스 만들기
    // 2. 메소드내에 내부클래스 만들기
    // 3. 익명(Anonymous)의 내부클래스 만들기

    class InnerClass {
        int code = 9999;
        String userid = "gga";

        InnerClass() {
            System.out.println("InnerClass()생성자");
        }

        void memberOutput() {
            System.out.println(code + "=" + userid);
        }

        void changeData() {
            code = 8888; // 내부클래스
            productNo = 5555; // 외부클래스의 멤버변수
            memberOutput(); // 내부클래스 메소드
            productList();  // 외부클래스 메소드 접근가능
        }


    }


    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.productList();


        //내부클래스 객체 생성 : 외부클래스 없이는 객체를 생성할 수 없음
        InnerClass ic = oc.new InnerClass();
        ic.memberOutput();
        ic.changeData();
        oc.createInner();
    }

}
