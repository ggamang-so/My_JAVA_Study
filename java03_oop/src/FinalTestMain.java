
public class FinalTestMain {

    public FinalTestMain() {

    }

    public void start() {

        FinalTest ft = new FinalTest();
        System.out.println(ft.COMPANY);
        System.out.println(FinalTest.PHONE);
//		System.out.println(ft.ADDRESS); private는 객체 생성을 통한 접근이 안됨
        ft.information();

    }


    public static void main(String[] args) {
        new FinalTestMain().start();


    }

}
