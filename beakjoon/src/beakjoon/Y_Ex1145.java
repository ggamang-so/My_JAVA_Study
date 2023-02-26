package beakjoon;

import java.util.Scanner;

public class Y_Ex1145 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int cnt = 0;
        int result=1;
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        while(check){
            for (int i = 0; i <arr.length; i++) {
                if(result%arr[i]==0) cnt++;
            }
            if(cnt>=3){
                check = false;
                break;
            }else{
                cnt=0;
                result++;
            }

        }
        System.out.println(result);

    }
}
