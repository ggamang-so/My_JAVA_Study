package beakjoon;

import java.util.Scanner;

public class Ex15996 {
    /*
문제
음이 아닌 정수 N와 소수(prime number) A가 주어지면, N!을 Ak로 나누었을 때,
나머지가 0이 되는 최대의 음이 아닌 정수 k를 구하여라. (단, N!=N×(N-1)×···×1, 0!=1)

입력
첫째 줄에 정수 N과 A가 사이에 공백을 두고 주어진다. (0 ≤ N < 231, 2 ≤ A ≤ 11, A는 소수)

출력
첫째 줄에 최대의 음이 아닌 정수 k를 출력한다


풀이 :
     */
    public Ex15996(){
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = scan.nextInt();
        int k = 0;
        while(true){
            if (num/a ==0) break;
            k += num / a;
            num /= a;
        }
        System.out.println(k);
    }

}
