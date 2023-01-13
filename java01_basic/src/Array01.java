
public class Array01 {

	public static void main(String[] args) {
		// 같은 데이터 형의 변수가 여러개 필요할 때;
		// 다른 데이터 형의 변수끼리는 배열에 넣을 수 없음.
		// 배열선언하는 방법
		int score[]; // 데이터 형에 해도 되고 변수 이름 옆에 해도 된다. 
		int[] jumsu;
		
		// heap 메모리에 "홍길동" --> 입력되어있는 주소 hash 코드 2500번지
		// 배열을 선언할때 int b[] = new int[5]; 이렇게 선언하면 
		// b라는 변수에 int형 데이터 5개를 담을 수 있는 배열을 선언되고 
		// 메모리가 할당된다.(초기에 설정한 배열의 크기값을 변경할 수 없음)
		// 기본데이터 8가지 형을 제외하고는 다 참조변수.
		

		// 정수형은 0, 실수 0.0, 논리형:false, 그외 객체타입:null 이 초기값으로 들어가있다.
		int[] data = new int[5];
		String name[] = new String[5];
		
		data[2] = 90;
		name[1] = "홍길동";
		
		
		for (int i=0;i<data.length; i++) {
			System.out.printf("data[i] = %d ,name[i] = %s \n",data[i], name[i]);
		}



	}

}
