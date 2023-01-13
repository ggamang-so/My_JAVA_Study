import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {
        //

        String addr1 = "서울시 강남구";
        String addr2 = "서울시 강남구";
        String addr3 = new String("서울시 강남구");  // 없어지는 방식 , 사용안하는걸 권장함


        if (addr1 == addr2) {  // 문자열, 클래스 변수에 담긴값 등을 비교할때는 연산자가 아니라 .equals를 사용
            System.out.println("addr1, addr2 are same");
        } else {
            System.out.println("addr1, addr2 are not same");
        }

        if (addr2 == addr3) {
            System.out.println("addr2, addr3 are same");
        } else {
            System.out.println("addr2, addr3 are not same");
        }

        if (addr2.equals(addr3)) {
            System.out.println("addr2, addr3 are same");
        } else {
            System.out.println("addr2, addr3 are not same");
        }

        //	  0123456789012345678901
        String str = "Java programing test..";
        String str2 = "java String Test";

        // j -> 106   J-> 74  ==> -32
        // 특정 index위치의 문자를 얻어오기

        char r1 = str.charAt(5);
        System.out.println("r1->" + r1);

        //str 과 str2를 비교하는 메소드
        //str-str2을 계산하여 값의 차이를 구한다.
        //차례로 알파벳을 아스키코드상 값으로 비교하다가 다른 문자가 나오면 둘의 차이를 반환해줌
        // 음수가 나오면 str이 str2보다 작다

        int r2 = str.compareTo(str2);
        System.out.println("r2 -> " + r2);

        // 대소문자 구분없이 알파벳만 다를때
        int r3 = str.compareToIgnoreCase(str2);
        System.out.println("r3 -> " + r3);

        // 문자열 연결
        String r4 = str.concat(str2); // str2.concat(str)    두 문자열을 연결해주는 메소드
        System.out.println("r4 -> " + r4);

        byte r5[] = str.getBytes();
        System.out.println(Arrays.toString(r5));

        int r6 = str.indexOf("p"); // 맨 앞에서부터 p 찾기
        System.out.println("r6 -> " + r6);

        int r7 = str.lastIndexOf("a");   // 맨 뒤에서부터 a 찾기
        System.out.println("r7 -> " + r7);

        int r8 = str.indexOf("a", 5);   // 5 인덱스부터 a 찾기
        System.out.println("r8 -> " + r8);

        String r9 = str.replace("Java", "자바");  // 앞 문자열을 뒷 문자열로 교체
        System.out.println("r9 -> " + r9);

        // 문자 조각내기
        String tel = "10-134-5678"; // 자리수가 다를수 있어 특정 위치가 아니라 특정 부호를 기준으로 자른다
        String telSplit[] = tel.split("-");
        System.out.println(Arrays.toString(telSplit));

        //문자열 일부 데이터 얻어오기  subString
        String r10 = str.substring(16);   //index 위치에서 끝까지
        System.out.println("r10 -> " + r10);

        String r11 = str.substring(5, 12);  //첫번째 인덱스 위치부터 두번째 인덱스 전까지
        System.out.println("r11 -> " + r11);

        String str3 = "    Trim 테스트      ";
        System.out.println(" ====" + str3 + "====");
        System.out.println(" ====" + str3.trim() + "====");  // 문자열 맨 앞과 뒤쪽으로 들어간 공백문자


        char c[] = {'J', 'A', 'V', 'A', 'O'};

        String r12 = String.valueOf(c); // 배열 내 항목(정수, 실수, 논리, char를 다 연결해서 문자열로 만들어 주는 메소드
        System.out.println("r12 -> " + r12);

        
        // 문자열 크기비교
        // .compareTo()  
        // 양수면 왼쪽이 크다
        // 음수면 오른쪽이 크다
        String str10 = "Oracle"; // O : 79  
        String str11 = "oracle"; // o : 111
        int result10 = str10.compareTo(str11); // 79 - 111 = -32
        System.out.println("str10, str11-> " +result10);
        int result11 = str11.compareTo(str10); // 111 - 79 = 32
        System.out.println("str11, str10-> " + result11);

    }

}
