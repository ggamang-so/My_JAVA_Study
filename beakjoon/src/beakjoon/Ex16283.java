package beakjoon;

import java.util.Scanner;

public class Ex16283 {
    public Ex16283(){
    }
    public void start(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int w = scan.nextInt();
        int x=0;
        int cnt = 0;
        if(n==2) {
            if(a+b==w){
                System.out.println(1+" "+1);
            }else{
                System.out.println(-1);
            }
        }else {
            for (int i = 1; i <= n; i++) {
                if (w == a * i + b * (n - i)) {
                    cnt++;
                    x = i;
                }
            }
            if (cnt != 1 || x == 0 || x == n) {
                System.out.println(-1);
            } else {
                System.out.println(x + " " + (n - x));
            }
        }
    }
    public static void main(String[] args) {
        new Ex16283().start();
    }
}
