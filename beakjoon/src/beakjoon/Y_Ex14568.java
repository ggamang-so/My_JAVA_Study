package beakjoon;

import java.util.Scanner;

public class Y_Ex14568 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //사탕수
        int i; //영훈
        int cnt = 0;
        int rest = 0;
        for (i = 1; i <= n; i++) {
            for (int j = i+2; j <= n; j++) {
                rest = n - i-j;
                if(rest%2==0 && rest>1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
