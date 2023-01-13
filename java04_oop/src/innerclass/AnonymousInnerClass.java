package innerclass;

public class AnonymousInnerClass {
    String myName = "고구마";

    public AnonymousInnerClass() {
    }

    public void start() {
        // 3. 익명(Anonymous) 내부 클래스
        // - 이름이 없이 생성하는 클래스로 객체 생성과 동시에 선언하는 클래스
        // - 반복으로 사용하지 않고 단 한번만 사용할 때  익명 내부클래스를 만든다.

        Sample s = new Sample() { // 익명클래스는 외부클래스명$(숫자).class 로 파일이 생성된다.
            int tot = 120;

            void totOutput() {
                System.out.println("tot = " + tot);
                System.out.println("myName = " + myName);
                // 외부 클래스의 변수 사용 가능
            }

            // Sample 클래스의 getSum의 오버라이딩
            // 익명의 내부클래스라도 상위 클래스에 들어있는 메소드의
            // 오버라이딩은 유지가 된다.
            public void getSum() {
                int total = 0;
                for (int i = 2; i <= 100; i += 2) {
                    total += i;
                }
                System.out.println("evenSum = " + total);
            }
        }; //.getSum();  //getOddSum();.totOutput();
//		s.totOutput(); // 익명의 내부클래스에서 새로 생성된 메소드는 상위의
        // Sample 클래스에 대입하면 사용할 수 없다.
        s.getSum();
    }

    public static void main(String[] args) {
        AnonymousInnerClass aic = new AnonymousInnerClass();
        aic.start();
    }
}
