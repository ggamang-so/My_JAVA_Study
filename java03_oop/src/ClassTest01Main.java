
public class ClassTest01Main {

    public static void main(String[] args) {
        // new 키워드로 객체를 생성한다.

        ClassTest01 ct1 = new ClassTest01();
        ClassTest01 ct2 = new ClassTest01(3);
        ClassTest01 ct3 = new ClassTest01("String");
        ClassTest01 ct4 = new ClassTest01(999, "String");

        ct1.method1();

        String result = ct2.method2(1234, 544);
        System.out.println("result = " + result);


        ct3.myName = "박태환";

        System.out.println(ct3.getMyName());

        System.out.println(ct4.getMyName());


    }

}
