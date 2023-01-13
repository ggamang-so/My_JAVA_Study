
public class PrivateStudentMain {

    public PrivateStudentMain() {
        PrivateStudent ps = new PrivateStudent();
//		String n = ps.name;
        ///priveate 접근제한자는 클래스 외부에서 접근을 허용하지 않는다. .
        // 객체명.필드명, 객체명.메소드(); new 생성자 메소드()를 허용하지 않는다.
//		System.out.println("name = " + n);

        ps.output();

        String name = ps.getName();
        System.out.println(name);
        ps.setName("이순신");
        System.out.println(ps.getName());

    }

    public static void main(String[] args) {
        new PrivateStudentMain();


    }

}
