package java04_oop;

class Testdd {
}

public class testddd extends Testdd {
    public static void main(String[] args) {
        Testdd t1 = new Testdd();
        testddd e1 = new testddd();
//            testddd e2 = (testddd)t1;
        Object o1 = (Object) t1;
//            String s1 = (String)t1;
        Testdd t2 = (Testdd) e1;
        System.out.println(t2);
    }
}