package beakjoon;

import java.util.Scanner;

public class Y_Ex14697 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int num =scan.nextInt();
        int cnt=0;
        for (int i = 0; i < num/a+1; i++) {
            for (int j = 0; j < num/b+1; j++) {
                for (int k = 0; k < num/c+1; k++) {
                   if(num-a*i-b*j-c*k==0){
                       cnt=1;
                   }
                }
            }
        }

        System.out.println(cnt);


    }
}
