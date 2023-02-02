package test001.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Array2Ex04 {
	static String[] stdName;
	static int[][] stdScore;
	static int stdCount;
	static int col;
	
	public static void setData() throws FileNotFoundException, IOException{

		File src = new File("src/test001/basic/sungjuk.txt");
		FileReader fr = new FileReader(src);
		BufferedReader br = new BufferedReader(fr);
		stdCount = Integer.parseInt(br.readLine());
		col = Integer.parseInt(br.readLine());
		stdName = new String[stdCount];
		stdScore= new int[stdCount+2][col+3]; // 학생수+2(총12행) , 과목수+3(총6열)

		for (int i=0; i<stdCount;i++) {
			String[] line = br.readLine().split(",");
			stdName[i] = line[0];
			for(int j=0; j<col; j++) {
				stdScore[i][j] = Integer.parseInt(line[j+1]);
			}
			
		}
	}
	// 점수 처리
	static void scoreProcess() { 
		for (int i=0; i<stdCount; i++) {
			for (int j =0; j<col; j++) {
				stdScore[i][col] += stdScore[i][j]; //개인별 총점
				stdScore[stdCount][j] += stdScore[i][j]; // 과목별 총점
			}
			stdScore[i][col+1] = stdScore[i][col]/col; // 개인별 평균
		}
		for(int j = 0; j<col; j++) { //과목별 평균 --> 필요없는 계산을 계속 하지 않기 위해서 별도로 뺌
			stdScore[stdCount+1][j] = stdScore[stdCount][j]/stdCount;
		}
	}
	// 석차
	static void scoreRank() {
		int rank;
		for (int i = 0; i<stdCount; i++) {
			rank =1;
			for(int j = 0; j<stdCount; j++) {
				if(stdScore[j][col+1] >stdScore[i][col+1]) {
					rank++;
				}
				stdScore[i][col+2] = rank;
			}
		}
		
	}
	
	
	
	//스코어 프린트
	static void scorePrint() {
		for(int r=0; r<stdScore.length; r++) {
			if(r<stdCount) {System.out.printf("%s\t", stdName[r]);}
			if(r==stdCount) System.out.print("과목별총점\t");
			if(r==stdCount+1) System.out.print("과목별평균\t");
			for(int c=0; c<stdScore[r].length; c++) {
				System.out.printf("%d\t", stdScore[r][c]);
			}
			System.out.println();
		}
		
	}
	public Array2Ex04() {
		

	}

	public static void main(String[] args) {
		try {
			setData();
			scoreProcess();
			scoreRank();
			scorePrint();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
