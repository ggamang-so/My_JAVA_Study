package beakjoon;

import java.util.Scanner;

public class Ex17945 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double root = a*a-b;
        int result1 = -a + (int)Math.sqrt(root);
        int result2 = -a - (int)Math.sqrt(root);
        if(result1 == result2){
            System.out.println(result1);
        }else{
            System.out.println(Math.min(result1, result2) +" "+Math.max(result1, result2));
        }
    }
}
