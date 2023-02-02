package test05.sort;

public class ArrayInsertionSort {

    public static void main(String[] args) {

        //삽입 정렬
        //배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 부분과 비교하며, 자신의 위치를 찾아 삽입한다.
        //데이터 : 1~100사이의 난수 10개
        // 난수로 배열만들기
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100)+1;
        }
        // 배열 프린트
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //insertion sort
        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i];
            int j;
            for (j = i-1; j >= 0 && temp<arr[j] ; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
            System.out.printf("정렬 %d 번째 : ",i);
            for (int h = 0; h < arr.length; h++) {
                System.out.print(arr[h]+" ");
            }
            System.out.println();

                
            }


        }


    }


