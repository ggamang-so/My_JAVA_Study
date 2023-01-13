package java05_exception;

import java.util.Scanner;

public class ExceptionTest3 {

	public ExceptionTest3() {
		// TODO Auto-generated constructor stub
	}
	public void inData() throws NumberFormatException{
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째수 -> ");
		String n1 = scan.nextLine(); // nextLine(); 콘솔에서 한줄씩 입력한다.(enter 포함)
		System.out.print("두번째수 -> ");
		String n2 = scan.nextLine(); 
			
		int n1Int = Integer.parseInt(n1);
		int n2Int = Integer.parseInt(n2);
		divide(n1Int,n2Int);
	}
	public void divide(int n1, int n2) throws ArithmeticException{
		int result = n1 / n2;
		System.out.printf("%d / %d =  %d \n",n1, n2, result);
		array();
		
	}
	public void array() throws ArrayIndexOutOfBoundsException {
		int[] data = {39,290,10,30};
		System.out.println(data[4]);
	}
	
	public static void main(String[] args) {
		try {
		ExceptionTest3 et3 = new ExceptionTest3();
		et3.inData();
		}catch(NumberFormatException e) {
			System.out.println("입력값은 숫자여야 합니다.");
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없어요");	
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		}
	}

}
