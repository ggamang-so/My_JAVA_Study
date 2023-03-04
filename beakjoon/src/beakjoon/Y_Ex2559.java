package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Y_Ex2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        int[] sum = new int[n-k+1];
        for (int i = 1; i <n+1; i++) {
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        }
        int idx = 0;
        for (int i = 0; i <= n-k; i++) {
            sum[i] = arr[i+k] - arr[i];
        }
        Arrays.sort(sum);
        System.out.println(sum[sum.length-1]);
    }
}
