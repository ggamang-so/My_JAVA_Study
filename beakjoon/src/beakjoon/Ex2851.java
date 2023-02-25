package beakjoon;

import java.util.Scanner;

public class Ex2851 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idx = 0;
        int result=100;
        int[] sum = new int[10];
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scan.nextLine());
            if (i == 0) {
                sum[i] = arr[i];
            }else{
                sum[i] = sum[i-1] + arr[i];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            if(result >= Math.abs(100-sum[i])){
                idx = i;
            }
        }
        System.out.println(sum[idx]);
    }
}
