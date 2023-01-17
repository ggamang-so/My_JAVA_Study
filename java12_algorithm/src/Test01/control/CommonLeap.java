package Test01.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CommonLeap {
	
	/*
	[처리조건]
	년도를 입력받아 윤년과 평년을 구별하여 출력하가. 
	첫번째 입력은 입력받을 년도의 갯수
	
	api사용하지 말것
	
	[처리결과]
	6
	4 100 400 2000 2001 2004
	#1 윤년
	#2 평년
	#3 윤년
	#4 윤년
	#5 평년
	#6 윤년	 
	 
	 */
	public CommonLeap() {
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int i = 1; i<= cnt; i++) {
			 int year = Integer.parseInt(st.nextToken());

             if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//윤년
                 System.out.printf("#%d 윤년\n",i); continue;
             } 
             System.out.printf("#%d 평년\n",i);
				
			}
			
			
	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	
		
		
		
	}

}
