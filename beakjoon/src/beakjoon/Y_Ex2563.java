package beakjoon;

import java.util.Scanner;

public class Y_Ex2563 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] arr = new int[100][100];
        for (int i = 1; i <= n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[x + j - 1][y + k - 1] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
