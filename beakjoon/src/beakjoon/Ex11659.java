package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex11659 {
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int m = scan.nextInt();
//        long[] result = new long[m];
//        int[] arr = new int[n];
//        long[] prefixSum = new long[n+1];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextInt();
//            prefixSum[i+1] = prefixSum[i] + arr[i];
//        }
//        for (int i = 0; i < m; i++) {
//            result[i] = -prefixSum[scan.nextInt()-1]+prefixSum[scan.nextInt()];
//        }
//        for (int i = 0; i <m ; i++) {
//            System.out.println(result[i]);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[0] = 0;
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(arr[end] - arr[start - 1]).append("\n");
        }
        System.out.println(sb);

    }
}
