
public class WrapperTest {

    public static void main(String[] args) {
        // Wrapper 클래스 : 기본데이터형을 객체로 생성해주는 클래스
        //  - >
        int num = 1234;

        Integer intObj = num;
//		Integer intObj2 = new Integer(num); // 취소선이 그어진 것은 앞으로 사라지는 표현임.


        int num2 = intObj;

        //java 1.5버전 이후로 생성자를 사용하지 않아도 Object을 기본형으로, 기본형을 Object으로 쉽게 변환할수 있다.

        System.out.println(intObj.MAX_VALUE);
        System.out.println(intObj.floatValue());
        System.out.println(intObj.hashCode());
        System.out.println(intObj);

        int age = Integer.parseInt("25");
        System.out.println(age + 25);
        double conData = Double.parseDouble("25");
        System.out.println(conData);

        System.out.println(Integer.max(21657, 2));


    }

}
