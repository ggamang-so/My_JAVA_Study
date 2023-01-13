import java.util.Arrays;
import java.util.Random;
public class Ex10ArrayRandom {

	public static void main(String[] args) {
		// 1~1000 사이의 값을 100개 만들어 배열에 저장하고
		// 총합, 제일 큰값, 제일 작은값, 평균을 구하라
		// max(), min() 사용하지말고, 반복과 조건문으로 
		int[] arr = new int[100];
		int sum = 0;
		int max = arr[0];
		int min = 1000;
		for (int i = 0; i < arr.length; i++) {
			Random ran = new Random();
			arr[i] = ran.nextInt(1000)+1;
			sum += arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			
		}
		int aver = sum/arr.length;
		int[] arrCopy = new int[arr.length];
		arrCopy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrCopy);
	
		System.out.println("총합 = "+ sum );
		System.out.println("평균 = "+ aver );
		
		System.out.println("최고값 = "+ arrCopy[arrCopy.length-1] );
		System.out.println("최저값 = "+ arrCopy[0] );
		System.out.println("최고값 = "+ max );
		System.out.println("최저값 = "+ min  );
/*
 * 총합 =
 * 평균 = 
 * 최고값 = 
 * 최저값 = 
 */

	}

}
