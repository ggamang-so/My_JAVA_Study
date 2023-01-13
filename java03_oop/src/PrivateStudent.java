
public class PrivateStudent {

    int num = 999;
    private String name = "gildong";


    public PrivateStudent() {
    }


    public void output() {
        System.out.println(num + ", " + name);
    }

    public String getName() {// getter : 캡슐화된 변수를 밖으로 내보낼때 만드는 메소드
        // get + 변수 첫글자 대문자로 변환해서 붙여준다.
        return name;
    }

    public void setName(String name) {// setter : 캡슐화된 변수를 외부 데이터로 변경할 때 만드는 메소드
        // set + 변수 첫글자 대문자로 변환해서 붙여준다.
        this.name = name;
    }

}
