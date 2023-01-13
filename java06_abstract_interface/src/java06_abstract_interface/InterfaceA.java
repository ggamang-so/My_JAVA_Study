package java06_abstract_interface;

// interface에는 
// static final상수
// 추상메소드를 기술한다. 
public interface InterfaceA extends InterfaceB {

	//상수 - pulbic static final을 생략해도 컴파일 과정에서 붙는다.
	public static final int MAX = 100;
	String FIRST_NAME = "LEE";
	
	//추상메소드 - public abstract 을 생략해도 컴파일 과정에서 붙는다.
	public int hap(int x, int y);
	public int cha(int x, int y);
	public int gob(int x, int y);
	public int mok(int x, int y);
	
	
}
