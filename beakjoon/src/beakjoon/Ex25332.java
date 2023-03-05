package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Ex25332 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        StringTokenizer st2;

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n+1];
        HashMap hm = new HashMap();
        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        for (int j = 1; j <= n; j++) {
            A[j] = A[j-1] + Integer.parseInt(st1.nextToken()) - Integer.parseInt(st2.nextToken());
            if(hm.containsKey(A[j])){
                hm.put(A[j], (int)hm.get(A[j])+1);
            }else{
                hm.put(A[j], 1);
            }
        }
        long cnt = 0;
        Iterator values = hm.values().iterator();
        while(values.hasNext()){
//           cnt += (int)values.next();
            System.out.println(values.next());
        }

        System.out.println(cnt);
    }
}
