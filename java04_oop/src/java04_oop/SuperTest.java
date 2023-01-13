package java04_oop;

class TestPP {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class ExPP {
    TestPP y;

    public void setY(TestPP y) {
        this.y = y;
    }

    public TestPP getY() {
        return y;
    }
}

public class SuperTest {
    public static void main(String[] args) {
        ExPP o = new ExPP();
        TestPP i = new TestPP();
        int n = 10;
        i.setX(n);
        o.setY(i);
        System.out.println(o.getY().getX());
    }
}
