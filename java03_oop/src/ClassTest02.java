
public class ClassTest02 {

    String model; // 모델명
    String color; // 색상
    int maxSpeed; // 최고속도

    ClassTest02() {
        print();
    }

    ClassTest02(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        print();
    }

    ClassTest02(int maxSpeed, String model, String color) {
        // 생성자 메소드는 같은 클래스에 있더라도 메소드 명으로 호출할 수 없다.
        // 호출하기 위해서는 this(); 사용 : 클래스 생성자 메소드 안애서 같은 클래스 내 다른 생성자 호출할떄 쓰임
        // 							 매개변수 없는 다른 생성자 메소드 호출

        this(model, color, maxSpeed);    // 호출하려는 생성자 메소드의 매개변수 순서를 중요하게 봐야함.
        // 그리고 다른 생성자 메소드를 호출할때는 원래 생성자 메소드 내 가장 먼저 실행되는 메소드로 불러와야함.
        // this(); 위에 다른 명령어가 있으면 오류
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//		print();
    }
//	ClassTest02(){
//		print();
//	}

    public void print() {
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("maxSpeed = " + maxSpeed);
    }


    public static void main(String a[]) {
        ClassTest02 ct = new ClassTest02();
        ClassTest02 ct2 = new ClassTest02("tesla", "white", 300);
        ClassTest02 ct3 = new ClassTest02(250, "BMW", "blue");


    }

}
