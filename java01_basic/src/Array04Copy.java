
public class Array04Copy {

	public static void main(String[] args) {
		//배열의 복사
		// 배열은 한번 생성되면 크기를 변경할 수 없다. 
		// 크기를 바꿔줘야할때 새로 배열을 생성하고 기존 배열을 복사해서 사용한다. 
		
		//                               복사하려는 원본 시작위치    		      복사할 배열 시작위치
		//System. arraycopy(Object src,     int srcPos,      Object dest,   int destPos,     int length)
		//					원본 배열명	 				          복사할 배열명  	                복사할 데이터 갯수

		int data[] = {54, 87, 15, 79, 34, 79, 32};
		
		// 새로운 배열을 생성하여 원래값(일부 or 전체) 복사
		int targetData[] = new int[20];
		
		
		System.arraycopy(data, 0, targetData, 3, data.length);
		
		for (int i=0; i<targetData.length; i++) {
			System.out.println("targetData["+i+"]="+targetData[i]);
		}
		
		
	}

}
