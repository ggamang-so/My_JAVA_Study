//class 에 final 붙으면 상속이 안됨
//method에 final 붙으면 오버라이딩이 안됨
//field에 final 붙으면 값 변경 안됨

public class FinalTest {
    // final 을 붙여서 만든 변수는 변수 이름을 모두 대문자로 하고 2단어 이상에서는 '_' 로 구분한다.
    // final 붙은 변수는 변수의 설정된 값을 변경할 수 없음.
    // final 분은 변수의 값을 할당하지 않고 선언만 해놓은 상태에서는 1번 값을 할당할 수 있고,
    // 할당한 이후에 바꾸루 수 없다.
    final String COMPANY = "멀캠";
    private final String ADDRESS;
    static final String PHONE = "01-1234-5678";


    FinalTest() {
        ADDRESS = "서울시 강남구";
//		ADDRESS = "서울시 영등포구";		
    }

    public void information() {
        System.out.println("회사명 = " + COMPANY);
        System.out.println("주소 = " + ADDRESS);
    }
}
