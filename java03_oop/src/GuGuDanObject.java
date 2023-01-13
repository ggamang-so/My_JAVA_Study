import java.util.Scanner;

public class GuGuDanObject {

    public GuGuDanObject() {
    }

    public int inputDan() {    // 출력을 원하는 단 수 입력 받는 메소드
        Scanner scan = new Scanner(System.in);
        System.out.print("단입력 : ");
        int dan = scan.nextInt();
        return dan;
    }


    public void oneDan(int dan) {// 1개의 단만 출력 하는 메소드
        for (int i = 1; i <= 9; i++) {
            int result = dan * i;
            System.out.println(dan + "x" + i + "=" + result);
        }
    }

    public void allDan() { // 전체 단(2~9단)을 출력하는 메소드
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("==" + dan + "단==");
            oneDan(dan);
//			for (int i = 1; i<=9; i++) {
//				int result = dan * i;
//				System.out.println(dan+"x"+i+"="+result);			


        }
    }


}
