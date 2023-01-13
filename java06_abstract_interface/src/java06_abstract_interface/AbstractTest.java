package java06_abstract_interface;
//추상클래스
// 일반 메소드와 1개 이상의 추상메소드를 가진 클래스를 말한다.
// 추상 메소드는 메소드명만 존재하고 실행부를 명시하지 않은 미완성 메소드를 말한다.
// 추상 메소드는 반환형 왼쪽에 abstract키워드를 표기해야함
// 추상 클래스는 class키워드 왼쪽에 abstract 키워드를 표기해야함

public abstract class AbstractTest {
	public AbstractTest() {}
	public void add(int a, int b) {
		int hap = a + b;
		System.out.printf("%d + %d = %d\n", a, b, hap);
	}
	public abstract void minus(int a, int b);
	public void multiple(int x, int y) {
		int mul = x * y;
		System.out.printf("%d + %d = %d\n", x, y, mul);
	}
	public abstract void divide(int x, int y);
}
