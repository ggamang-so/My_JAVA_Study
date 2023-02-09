package beakjoon;

public class Ex9095 {

	public Ex9095() {
		int result=0;
		for (int i = 1 ; i < 10; i++ ) {
			result += Math.pow(2, i-1);
			System.out.println(i + " ==> " + result );
		}
		
		
	}

	public static void main(String[] args) {
		new Ex9095();
	}

}
