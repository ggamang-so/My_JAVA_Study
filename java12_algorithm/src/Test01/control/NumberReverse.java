package Test01.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//숫자 뒤집기
//   123456789 -> 987654321
public class NumberReverse {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



	public NumberReverse() {
	}
	
	static void numberReverse(int data) {

			String st = String.valueOf(data);
			StringBuffer str = new StringBuffer(st);
			System.out.print(str);
			str.reverse();
			System.out.print(" --> " +str);
	
		
	}
	static void StringReverseArray(String data) {
		char[] c = data.toCharArray();
		System.out.print(new String(c));
		for (int i = 0; i<(c.length)/2; i++) {
			char temp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		
		}
		System.out.println(" --> " + new String(c));
		
	}

	public static void main(String[] args) {
		try {
//			int data = Integer.parseInt(br.readLine());
			String data = br.readLine();
			
			StringReverseArray(data);
//			numberReverse(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
