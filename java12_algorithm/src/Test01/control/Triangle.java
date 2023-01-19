package Test01.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle {
	char spell = 'A';
	public Triangle() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {		
			int max = Integer.parseInt(br.readLine());
			//A : 65 ~ Z : 90 			
			for (int i = 1; i<= max; i++) {
				if (i <= max/2+1) { // 
					spacePrint((max/2+1)-i);
					stringPrint(2*i-1);
					System.out.println();
				}
				if(i>(max/2)+1) {
					spacePrint(i-(max/2+1));
					stringPrint(2*(max-i)+1);
					System.out.println();
				}
			}
		}catch(Exception e) {
		}
	}
	public void spacePrint(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.print(" ");
		}
	}
	public void stringPrint(int b) {
		for (int i = 1; i<=b; i++) {
			if ((int) spell >90) {
				spell = 'A';
			}
			System.out.print(spell);
			spell++;
		}
		
	}

	public static void main(String[] args) {
		new Triangle();
		
		
	}

}
