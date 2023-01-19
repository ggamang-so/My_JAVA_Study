package test001.basic;

public class Array2Ex02 {

	public Array2Ex02() {
		
		
		String[][] omok = new String[5][5];
		
		for (int i=0; i<omok.length; i++) {
			for(int j = 0; j <omok[i].length; j++) {
				if (i+j == 4 || i==j ) {
					omok[i][j] = "X";
					System.out.print(omok[i][j] + "\t");
				}else {
					omok[i][j] = "O";
					System.out.print(omok[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		new Array2Ex02();
	}

}
