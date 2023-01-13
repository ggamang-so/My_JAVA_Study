import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        // Random 클래스 : 난수를 구한다 . java.util 패키지 클래스
        Random ran = new Random();

        // nextInt() : int 범위의 수중에 1개를 무작위로 얻어온다.
        // ()안에 숫자를 넣으면 0부터 숫자 사이의 무작위 정수가 구해진다.
        for (int i = 1; i <= 100; i++) {
            int num = Math.abs(ran.nextInt(100));
            System.out.print(num + "\t");
            if (i % 10 == 0) System.out.println();

        }

        for (int i = 1; i <= 100; i++) {
            boolean boo = ran.nextBoolean();
            System.out.print(boo + "\t");
            if (i % 10 == 0) System.out.println();

        }


    }

}
