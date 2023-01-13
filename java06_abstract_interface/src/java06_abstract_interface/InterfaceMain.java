package java06_abstract_interface;

// 클래스에서 추상메소드들이 있는 interface를 사용하기 위해서는
// implements키워드를 이용하여 상속을 받은 후 
// 모든 추상메소드를 오버라이딩 해야함
// interface는 여러개 상속 받을 수 있음
// interface가 상속받고있는 상위 interface의 추상 메소드까지도 다 오버라이딩 해야함
public class InterfaceMain  implements InterfaceA, InterfaceC {
	public InterfaceMain() {
		
	}
	
	@Override
	public int hap(int x, int y){
		return x+y;
	}
	@Override
	public int cha(int x, int y) {
		return x-y;
	}
	@Override
	public int gob(int x, int y) {
		return x*y;
	}
	@Override
	public int mok(int x, int y) {
		return x/y;
	}
	
	


	@Override
	public String detDouble() {
		 
		return null;
	}

	@Override
	public void setDouble(double n) {
		 
		
	}

	@Override
	public void output() {
		System.out.println("MAX = " + MAX);
		System.out.println("MAX_DOUBLE = " + MAX_DOUBLE);
		System.out.println("STATUS = " + STATUS);
		
		
		
	}
	public static void main(String[] args) {
		 InterfaceMain im = new InterfaceMain();
		 im.output();
		 // interface를 상속받은 클래스의 객체 생성과 대입
		 // new InterfaceA(); --> interface는 객체생성불가
		 // 하지만 클래스의 객체를 상속받은 interface 변수에 넣을 수는 있음
		 InterfaceA a = new InterfaceMain();
		 System.out.println(a.hap(100,  25));
//		 a.output(); --> output메소드는 interfaceC의 인터페이스에
		 			// 정의된 메소드라 interfaceA 변수로 넣은 a에서 
		 			// output 메소드는 숨겨져 있음
		 InterfaceMain im2 = (InterfaceMain) a;
		 im2.output();
		 // 강제 형변환을 해주면 하위의 변수로 넣을 수 있음
		 
	}

}
