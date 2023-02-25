package beakjoon;

import java.util.Scanner;

public class Y_Ex6131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cnt=0;
        for (int i = 1; i <= 500 ; i++) {
            for (int j = i; j <=500; j++) {
                if(i*i+n == j*j){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
