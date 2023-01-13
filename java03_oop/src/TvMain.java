import java.util.Scanner;

public class TvMain {

    Scanner scan = new Scanner(System.in);

    public void startMenu() {
        Tv tv = Tv.getInstanc();
        do {
            tv.tvInformation();
            System.out.print("메뉴선택(1:볼륨업, 2: 볼륨다운, 3:채널업 , 4: 채널다운, 5: 전원)=");

            int menu = scan.nextInt();
            switch (menu) {
                case 1:
                    tv.volumeUp();
                    break;
                case 2:
                    tv.volumeDown();
                    break;
                case 3:
                    tv.channelUp();
                    break;
                case 4:
                    tv.channelDown();
                    break;
                case 5:
                    tv.setOnOff();

            }

        } while (true);

    }

    ///////////////////////////////////////////////////
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TvMain main = new TvMain();
        main.startMenu();

    }

}
