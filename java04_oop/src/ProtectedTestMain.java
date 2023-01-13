import java04_oop.MyData;

public class ProtectedTestMain extends MyData {

    public ProtectedTestMain() {
        // TODO Auto-generated constructor stub
    }

    public void start() {
        MyData md = new MyData();
        md.getUsername();
    }

    public static void main(String[] args) {
        new ProtectedTestMain().start();


    }

}
