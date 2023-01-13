package java04_oop;

// Car 클래스를 상속받는다. 상속은 1개만 받을 수 있음
// 상송 관계에서 생성자 메소드는 상위클래스의 생성자를 먼저 실행하고 하위 클래스로 생성자를 실행한다.
public class Bus extends Car {
    int maxSpeed = 150;

    public Bus() {
        // 하위 클래스의 생성자 메소드에서 상위클래스의 원하는 생성자메소드를 호출한다.
        // 첫번째 실행문이어야 한다.
        //this() : 현재클래스
        //super()' 상위

        super("소나타", "Black"); // 제일 먼저 나와야함

        System.out.println("Bus()생성자");
        System.out.println("maxSpeed ->" + maxSpeed);


    }

    public void output() {
        System.out.println("모델---> " + model);
        System.out.println("컬러---> " + color);
        System.out.println("최고속도---> " + maxSpeed);
        // 자식 클래스에서 같은 이름의 변수를 새로 정의하고 부모 클래스의 멤버변수에 대한 내용불러올때
        System.out.println("Car의 최고속도 = " + super.maxSpeed);


    }
    //상위 클래스 메소드 재정의 : 오버라이딩(overriding)
    // 메소드명, 매개변수의 갯수, 데이터혀잉 같아야한다.
    // 접근제어자 상위클래스의 접근제어자 넓은 의미의 제어자야여한다.

    public void speedUp() {
        super.speedUp(); // 자식클래스에서 오버라이딩 된 메소드의 상위클래스 메소드 호출
        speed += 10;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println(bus.maxSpeed);
        bus.output();
        bus.speedUp();
        System.out.println(bus.speed);
    }

}
