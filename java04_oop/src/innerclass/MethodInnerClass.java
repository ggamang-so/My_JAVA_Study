package innerclass;

public class MethodInnerClass {
    String email = "ggamangso@naver.com";


    public MethodInnerClass() {
        System.out.println("MethodInnerClass() 생성자");
    }

    public void emailOutput() {
        System.out.println("이메일 = " + email + "=========================");
    }

    public void createInner() {
        int num = 100;

        //메소드 내부에 생성하는 내부클래스
        // 외부클래스의 정보와 메소드내에서 정의한 데이터를 사용가능하다.

        class InnerClass {
            String name = "세종대왕";

            InnerClass() {
                System.out.println("num = " + num);
                System.out.println("name = " + name);
                System.out.println("addr = " + addr); // 외부 클래스 내 선언된 변수는 내부클래스 선언 순서와 상관없이 사용 가능,
                //객체생성전에 멤버변수들이 먼저 생성되기 때문에
//				System.out.println("tel = "+tel); // 같은 메소드 내에라도 클래스 선언 전에 선언된 변수만 사용 가능

            }

            void getInformation() {
                emailOutput();//외부 클래스의 메소드 호출
                System.out.println("email = " + email + "*******************");
            }
        }//
        String tel = "010-7896-9999";
        // 메소드 내에 만든 클래스는 그 메소드 내에 객체를 미리 만들어 주어야 한다.
        InnerClass ic = new InnerClass();
        ic.getInformation();//
    }

    String addr = "서울시 성동구";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MethodInnerClass mic = new MethodInnerClass();
        mic.createInner();


    }

}
