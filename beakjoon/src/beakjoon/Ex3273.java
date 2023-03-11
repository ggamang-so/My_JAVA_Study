package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count=0;
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            sum[i] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        int left = 1;
        int right = 2;
        while(true){


        }

        System.out.println(count);


    }
}
