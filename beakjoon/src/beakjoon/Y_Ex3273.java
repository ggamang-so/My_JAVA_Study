package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Y_Ex3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count=0;
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        int left = 1;
        int right = n;
        Arrays.sort(arr);
        while(true){
            if(left==right) break;
            if(arr[left]+arr[right]<k) {
                left++;
                continue;
            }
            if(arr[left]+arr[right]==k){
                count++;
                right--;
                continue;
            }
            if(arr[left]+arr[right]>k){
                right--;
            }
        }
        System.out.println(count);
    }
}
