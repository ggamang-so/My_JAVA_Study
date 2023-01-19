package test02.ex.sw;

import java.util.Scanner;

public class Solution2072{
    public Solution2072(){
    }
 
    public static void main(String[] arg){
    Scanner scan = new Scanner(System.in);
    int testcase = Integer.parseInt(scan.nextLine());
    int[] sums = new int[testcase];
        for (int i=0; i<sums.length; i++){
            String[] arr = scan.nextLine().split(" ");
            for(int j=0; j<arr.length; j++){
                if(Integer.parseInt(arr[j])%2!=0){ sums[i]+=Integer.parseInt(arr[j]);}
            }   
        }
        for (int i=0; i<sums.length; i++){
        System.out.printf("#%d %d\n",i+1, sums[i]);         
        }
        
      
                
            
    }


}
