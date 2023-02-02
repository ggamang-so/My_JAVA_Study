package test05.sort;

import java.util.Random;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        /*
        Bubble Sort
        두 인접한 요소를 검사하여 정렬하는 방법
        [장점]
            구현이 쉽다
            이미 정렬된 데이터를 정렬할 때 빠르다
       [단점]
            다른 정렬에 비해 정렬 속도가 느리다
            역순 배열을 정렬할 때 가장 느리다.
        */

        //난수를 생성해서 배열에 저장 후 버블 정렬을 오름차순으로 하기
        // 배열 만들기
        Random ran = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100)+1;
        }
        // 정렬 전 배열 출력하기
        System.out.println("============ 정렬전 ===========");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        // 버블 정렬하기
        for (int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length-1-k; i++) { // 0과 1, 1과 2 ~  8과 9까지 하기 때문에 반복은 0~8까지만
                if(arr[i] > arr[i+1]){ // 인덱스 i와 i+1 을 비교해서 i가 크면 순서 바꾸기
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

        System.out.printf("-------%d번 정렬후-------\n", k);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
            if( i!= arr.length-1) System.out.print(", ");
        }
        System.out.println();

        }



    }
}
