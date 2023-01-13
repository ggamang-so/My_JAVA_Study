import java.util.Arrays;

public class MathRandom {

    public static void main(String[] args) {
        // 난수는 0.0보다 크고 1.0보다 작은 실수(double)를 1개 만들어준다.
        int[] random = new int[100];
        for (int i = 0; i < random.length; i++) {
            double ran = Math.random();
            // 0~100 까지 구할땐 : 100-0+1 = 101 을 곱한다.
            // 10~100 까지 구할땐 : 100-10+1 = 91 을 곱하고 10을 더한다.
            random[i] = (int) (ran * (45 - 23 + 1) + 23);  // 0~ 100까지
        }
        Arrays.sort(random);
        String str = Arrays.toString(random);
        System.out.println(str);

//			System.out.print(ranInt+"\t");
//			if(i%10 ==0) {
//				System.out.println();
//				
//			}


        //원하는 범위의 정수의 난수를 구하기 위하기 위해서는 난수에 범위의 정수 갯수(큰값-작은값+1)를 곱하기를 해서 구함


    }

}
