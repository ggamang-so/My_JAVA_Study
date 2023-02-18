package beakjoon;

import java.util.Scanner;

public class Y_Ex14232 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong(); // 입력받는 값이 2~10^12 이기 때문에 int 범위 초과
        String sb="";
        int cnt=0;
        for (long i = 2; i*i < n; i++) { // i를 int로 하니까 안되고, long으로 하니까 되네;
            while(true){
                if(n%i==0) {
                    sb += i;
                    cnt++;
                    n/=i;
                    if(n!=1) sb += " ";
                }else break;
            }

        }
        if(n!=1){
            sb += n;
            cnt++;
        }
        System.out.println(cnt);
        System.out.println(sb);
        // 결과 : 시간초과... 뭐가 오래걸리는걸까? 뭘 줄여야할까?

    }
}
