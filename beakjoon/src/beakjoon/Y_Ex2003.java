package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Y_Ex2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count=0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int leftP = 1;
        int rightP = 1;
        st= new StringTokenizer(br.readLine());
        int[] sum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            sum[i]= sum[i-1] + Integer.parseInt(st.nextToken());
        }
        while(true){
            if(sum[rightP]-sum[leftP-1]<M){
                rightP++;
            }else if(sum[rightP]-sum[leftP-1]==M){
                count++;
                rightP++;
            }else{
                leftP++;
            }
            if(rightP>N||leftP>N){
                break;
            }
        }
        System.out.println(count);


    }
}
