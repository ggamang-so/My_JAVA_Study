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
        int N = Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int leftP = 0;
        int rightP = 1;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(br.readLine());
        while(true){
            if(rightP==leftP||rightP<leftP){
               rightP++;
               continue;
            }
            if(arr[rightP] + arr[leftP] <X){
                rightP++;
            }else if(arr[rightP] + arr[leftP]==X){
                count++;
                rightP++;
            }else{
                leftP++;
            }
            if(rightP>N-1||leftP>N-1){
                break;
            }
        }
        System.out.println(count);


    }
}
