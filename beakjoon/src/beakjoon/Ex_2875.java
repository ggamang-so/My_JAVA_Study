package beakjoon;

import java.util.Scanner;

public class Ex_2875 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int result = 0;
        int cnt=0;

        for (int i = 0; i <= k; i++) {
            if(m-k+i==0) continue;
            if((n-i)>=m-k+i){
                result=m;
            }else{
                result = (n-i)/(m-k+i);
            }
            if(result>cnt){
                cnt=result;
            }
        }
        System.out.println(cnt);
    }
}
