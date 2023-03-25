package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14400 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = Integer.parseInt(scan.nextLine());
        int[] xPos = new int[cnt];
        int[] yPos = new int[cnt];
        int x = 0, y=0;
        String[] nums = null;
        for (int i = 0; i < cnt; i++) {
            nums = scan.nextLine().split(" ");
            xPos[i] = Integer.parseInt(nums[0]);
            yPos[i] = Integer.parseInt(nums[1]);
        }

        x=xPos[cnt/2+cnt%2-1];
        y=yPos[cnt/2+cnt%2-1];
        int distance = 0;
        for (int i = 0; i < cnt; i++) {
            distance += (Math.abs(xPos[i]-x) + Math.abs(yPos[i]-y));
        }
        System.out.println(distance);
    }
}
