package test02.ex.sw;


import java.util.Scanner;

public class Solution1204 {

	public Solution1204() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = Integer.parseInt(scan.nextLine());
		int[] result = new int[testCase];
		String[] arr = new String[1000];
		for (int i=1; i<=testCase; i++) {
			String a = scan.nextLine();
			arr =scan.nextLine().split(" ");
			int[] cnt = new int[101];
			for (int j=0; j<=100; j++) {
				for(int k=0; k< arr.length; k++) {
					if(arr[k].equals(String.valueOf(j))) {
						cnt[j] += 1;	
					}
				}
			}
			int compare = cnt[0];
			int thisIndex=0;
//			System.out.println(Arrays.toString(cnt));
			for (int l = 1; l<cnt.length; l++) {
				if(compare <= cnt[l]) {
					compare = cnt[l];
					result[i-1] = l;
				}
			}
//			System.out.println(compare);
	
						
		}
		for (int i=0; i<testCase; i++) {
		System.out.printf("#%d %d\n",i+1, result[i] );
		}
		
		
		
	}

}
