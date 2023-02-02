package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex18310 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = Integer.parseInt(scan.nextLine());
        String[] houses = scan.nextLine().split(" ");
        int[] house = new int[houses.length];
        for (int i = 0; i < houses.length; i++) {
            house[i] = Integer.parseInt(houses[i]);
        }
        Arrays.sort(house);
        if (cnt%2==0){
            System.out.println(house[cnt/2-1]);
        }
        if (cnt%2!=0){
            System.out.println(house[cnt/2]);
        }

//        System.out.println(Arrays.toString(check));
//        System.out.println(antena);

        }
    }

