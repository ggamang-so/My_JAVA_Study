import java.util.Arrays;
import java.util.Collections;


public class ArraysTest {

    public static void main(String[] args) {
        // Arrays 클래스를 이용한 배열처리

        int data[] = {23, 86, 7, 47, 862, 90, 2};

        // .copyOf() : index 0부터 원하는 수만큼 복사
        int copy1[] = Arrays.copyOf(data, 4);
        String copy1Str = Arrays.toString(copy1); // copy1 배열의 값을 문자열로 반환
        System.out.println("copy1 -> " + copy1Str);


        // .copyOfRange(원본배열명, 시작인덱스, 끝 인덱스)
        int copy2[] = Arrays.copyOfRange(data, 2, 6);
        System.out.println("copy2 -> " + Arrays.toString(copy2));

        // .sort() : 배열내 데이터를 오름차순으로 정렬함. 기존 배열 데이터 순서 자체를 변경하기 때문에 이전 상태로 돌릴수 없음.
        System.out.println("변경 전 data -> " + Arrays.toString(data));
        Arrays.sort(data);
        System.out.println("변경 후 data -> " + Arrays.toString(data));

        String color[] = {"orange", "red", "blue", "yellow", "green", "pink"};
        System.out.println("변경 전 color -> " + Arrays.toString(color));
        Arrays.sort(color);
        System.out.println("변경 후 color -> " + Arrays.toString(color));

        //배열의 값을 Descending 으로 정렬
        Arrays.sort(color, Collections.reverseOrder());


    }


}
