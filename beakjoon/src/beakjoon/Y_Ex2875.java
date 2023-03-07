package beakjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Y_Ex2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = 0;
        int cnt=0;

        for (int i = 0; i <= k && i<n && i-k<m; i++) {
            if((n-i)>=(m-k+i)*2){
                result=m-k+i;
            }else{
                result=(n-i)/2;
            }
            if(result>cnt){
                cnt=result;
            }
        }
        System.out.println(cnt);

    }
}
