package test05.sort;

public class ArraySelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100)+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();



        for (int i = 0; i < arr.length-1; i++) {
            int minIndex= i ;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            for (int h = 0; h < arr.length; h++) {
                System.out.print(arr[h] + " ");
            }
            System.out.println();
        }



    }
}
