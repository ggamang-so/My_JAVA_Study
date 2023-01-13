
public class Array02 {

	public static void main(String[] args) {
		// 배열 생성시 초기값을 지정해서 배열 생성하는 방법
		
		String colorName[] = new String[]{"RED","GREEN","BLUE","YELLOW",null,null};
		
		for (int idx=0; idx<colorName.length; idx++) {
			System.out.println("colorName["+idx+"] = "+ colorName[idx]);
		}
		int jumsu[] = {25, 95, 36, 48, 75}; // 데이터를 직접 넣을 때는 앞에 생성자 new 클래스 명 을 붙이지 않아도 됨
		for (int i = 0; i<jumsu.length; i++) {
			System.out.println("jumsu["+i+"] = " + jumsu[i]);
		}
		
		//확장된 for문
		//      변수 		배열내 데이터를 차례대로
		for(int data : jumsu) {
			System.out.println(data);
			
		}
	}

}
