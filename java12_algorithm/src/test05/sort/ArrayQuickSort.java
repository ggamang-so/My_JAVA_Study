package test05.sort;

public class ArrayQuickSort {

    static void swap(int arr[], int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx1]=temp;

    }
    static void quickSort(int arr[], int left, int right){
    int pLeft = left;
    int pRight = right;
    int pivot = (left + right)/2;

    int x = arr[pivot];
    do{
        while(arr[pLeft] < x){
            pLeft++;
        }
        while(arr[pRight] > x ){
            pRight--;
        }
        if(pLeft <= pRight) {
            swap(arr, pLeft, pRight);
        }
    }while(pLeft <= pRight);

    // 재귀호출
    if(left<pRight){
        quickSort(arr, left, pRight);
    }
    if(pLeft<right) {
        quickSort(arr, pLeft, right);
    }
    print(arr);


    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 퀵정렬(Quick Sort)
        // 리스트에서 가운데 값을 선택하여(pivot) 피벗 위치의 값보다 작은 것은 욎꼬에, 큰것은 오른쪽에 배치하여
        // 오름차순 정렬을 구현한다.
        //최악 O(n^2), 평균 : O(nlogn)

        int[] arr = new int[10];
        int left = 0;
        int right = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100)+1;
        }
        print(arr);
        quickSort(arr, left, right);






    }
}
