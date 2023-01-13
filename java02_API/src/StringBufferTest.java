
public class StringBufferTest {

    public static void main(String[] args) {
        // 문자열 처리하는 클래스 : String, StringBuffer, StringBuilder

        StringBuffer sb = new StringBuffer();
        sb.append(1234);  // 현재 문자열 마지막에 문자열 추가  정수, 실수, 논리형 모두 문자열로 변환되어 추가됨
        sb.append("ABCDE");
        sb.append(555.3698);
        sb.append(true);
        System.out.println("sb = " + sb.toString());  // sb = 1234ABCDE555.3698true
        sb.insert(5, "스트링버퍼");                          // 원하는 위치에 뒤에 문자열을 끼워넣기
        System.out.println("sb = " + sb.toString());  // sb = 1234A스트링버퍼BCDE555.3698true

        System.out.println("capacity = " + sb.capacity());  // StringBuffer를 생성하면 기본으로 16 byte 크기의 메모리를 자동 확보함


        // 문자열 일부 지우기     012345 678 90123456789012345
        // 				sb = 1234A스트링버퍼BCDE555.3698true (현재상태)
        sb.delete(3, 6);   // 앞에 인덱스 위치부터 뒤에 인덱스 전까지
        System.out.println("sb = " + sb.toString());

        sb.reverse();   // 문자열 뒤집기
        System.out.println("sb = " + sb.toString());


    }

}
