package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Y_Ex2309 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9];
        int sum =0;
        int x=0;
        int y=0;
        for (int h = 0; h < 9; h++) {
            arr[h] = Integer.parseInt(scan.nextLine());
            sum += arr[h];
        }
        Arrays.sort(arr);
        for ( int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum-arr[i]-arr[j]==100){
                    x=i;
                    y=j;
                }
            }
        }
        for (int k = 0; k < 9; k++) {
            if(k!=x && k!=y){
                System.out.println(arr[k]);
            }
        }
    }
}
