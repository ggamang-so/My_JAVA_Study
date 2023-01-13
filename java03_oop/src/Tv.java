public class Tv {

    final static int MAX_CHANNEL = 15; // 최대 채널
    final static int MAX_VOLUME = 10; // 최대 볼륨

    boolean power = false;
    int volume;
    int channel = 1;

    // 생성자 메소드의 오버로딩
    public Tv() {

        power = true;
        volume = 5;
        channel = 10;

    }

    public Tv(boolean power, int channel, int volume) {
        this.power = power;
        this.volume = volume;
        this.channel = channel;
    }

    public Tv(int channel, boolean power, int volume) {
        this(power, channel, volume); // 다른 생성자 호출, 처음 실행문이어야한다.
    }

    public Tv(int channel, int volume, boolean power) {
        this(power, channel, volume);
    }

    public static Tv getInstanc() {
        return new Tv();
    }

    ///////////// 현재정보 출력 ///////////////////////////////
    public void tvInformation() {
        System.out.println("전원 : " + power + ", 채널 : " + channel + ", 볼륨 : " + volume);

    }

    // 볼륨업//
    public void volumeUp() {
        volume++;
        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        }
    }

    // 볼륨다운
    public void volumeDown() {
        volume--;
        if (volume < 0) {
            volume = 0;
        }
    }

    // 채널업
    public void channelUp() {
        channel++;
        if (channel > MAX_CHANNEL) {
            channel = 1;
        }
    }

    // 채널다운
    public void channelDown() {
        channel--;
        if (channel < 1) {
            channel = MAX_CHANNEL;
        }
    }

    public void setOnOff() {
        power = !power;
        if (!power) {
            System.exit(0); // 프로그램 종료, exit(0)에서 0은 정상종료
        }
    }

}
