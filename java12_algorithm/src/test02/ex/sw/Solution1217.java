package test02.ex.sw;

import java.util.Scanner;

public class Solution1217{
 
    public Solution1217(){
    }
    static int cal(int a, int b){
        if (b==1) return a;
        return a*cal(a, b-1);
    }
    
    
    
    
    
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        for(int i=1; i<=10; i++){
        String n = scan.nextLine();
        String [] nums = scan.nextLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        System.out.printf("#%d %d\n", i, cal(a, b));
        }
        
    }
    
}