package java06_abstract_interface;

public class AbstractTestMain extends AbstractTest {
	// 추상 클래스 사용하기
	// 1. 추상클래스는 반드시 extends 상속받아야함
	// 2. 상속받는 추상클래스의 모든 추상메소드를 오버라이딩 해야한다.
	//   ==> 오버라이딩을 안하면 해당 클래스도 추상클래스가 되버림
	// 3. 추상클래스는 미완성 클래스이기 때문에 new로 객체 생성할수 없음
	
	public void minus(int a, int b) {
		int result = Math.abs(a-b); //abs : 절대값 구하기
		System.out.printf("%d + %d = %d\n", a, b, result);
	}
	public void divide(int a, int b) {}
	//상위 추상클래스의 추상메소드 중 필요 없는 것은 이렇게라도 오버라이딩 해야함
	
	public static void main(String[] args) {

		AbstractTestMain am = new AbstractTestMain();
		am.add(5, 9);
		am.minus(9, 20);


	}

}
