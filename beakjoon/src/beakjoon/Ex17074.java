package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex17074 {
/*
문제
정렬이란, 배열의 모든 원소가 비내림차순이 되도록 순서를 바꾸는 것을 말한다. 예를 들어 배열 [2, 1, 2, 3, 1]을 정렬하면 [1, 1, 2, 2, 3]이 된다.

남규는 정수 N개로 이루어진 배열 하나를 갖고 있다. 이 배열에서, 남규는 맘에 들지 않는 수를 정확히 하나 골라서 버릴 것이다.

예를 들어, 남규가 가진 배열이 [1, 2, 3, 2]라면, 남규는 1을 버려 [2, 3, 2]를 만들거나, 첫 2를 버려 [1, 3, 2]를 만들거나,
3을 버려 [1, 2, 2]를 만들거나, 두 번째 2를 버려 [1, 2, 3]을 만들 수 있다. 그리고 네 가지 경우 중 결과가 정렬된 것은 [1, 2, 2]와 [1, 2, 3] 두 가지이다.
남규는 이처럼, 수 하나를 버린 뒤 결과 배열이 정렬되어 있기를 원한다.

남규가 갖고 있는 배열이 주어지면, 수 하나를 버려 정렬된 배열을 남기는 방법의 수를 구해보도록 하자.

입력
첫째 줄에 배열의 크기 N이 주어진다. (2 ≤ N ≤ 105)

둘째 줄에 배열의 원소 ai가 공백으로 구분되어 N개 주어진다. (-109 ≤ ai ≤ 109)

출력
남규가 수 하나를 버려 정렬된 배열을 만드는 경우의 수를 출력한다.
 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int cnt=0;
        int result=0;
        int idx=0;
        int[] arr = new int[n];
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i-1]>arr[i]){
                cnt++;
                idx = i;
            }
        }
        if(cnt==0) result=n;
        if(cnt==1){
            if (n > 2) {
                if(idx==1){
                    result++;
                    if(arr[idx-1]<=arr[idx+1]){
                        result++;
                    }
                }
                if(idx==n-1){
                    result++;
                    if(arr[idx-2]<=arr[idx]){
                        result++;
                    }
                }
                if(idx!=1&&idx!=n-1){
                    if(arr[idx-1]<=arr[idx+1]){
                        result++;
                    }
                    if(arr[idx]<=arr[idx+2]){
                        result++;
                    }
                }
            }else{
                result=2;
            }

        }
        System.out.println(result);

    }
}
