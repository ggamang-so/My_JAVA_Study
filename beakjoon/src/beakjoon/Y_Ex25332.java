package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Y_Ex25332 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        StringTokenizer st2;

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n+1];
        HashMap hm = new HashMap();
        long cnt = 0;
        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        for (int j =1; j <= n; j++) {
            A[j] = A[j-1] + Integer.parseInt(st1.nextToken()) - Integer.parseInt(st2.nextToken());
            if(A[j]==0) cnt++;
            if(hm.containsKey(A[j])){
                cnt+=(int)hm.get(A[j]);
                hm.put(A[j], (int)hm.get(A[j])+1);
            }else{
                hm.put(A[j], 1);
            }
        }
        System.out.println(cnt);
    }
}
