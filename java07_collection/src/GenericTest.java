//제너릭으로 많이 사용하는 용어
/*
 *  V : value	(기본데이터타입)
 *  K : key		(키워드)
 *  E : element	(객체)
 */
public class GenericTest<V, E> {
	
	private V num;
	private E name;
	public GenericTest() {}
	
	@Override
	public String toString() {
		return "GenericTest [num=" + num + ", name=" + name + "]";
	}

	//getter setter
	public V getNum() {
		return num;
	}
	public void setNum(V num) {
		this.num = num;
	}
	public E getName() {
		return name;
	}
	public void setName(E name) {
		this.name = name;
	}
	
	

	
}
