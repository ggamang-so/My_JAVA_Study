package innerclass;

public class Sample {

    public Sample() {
        // TODO Auto-generated constructor stub
    }

    public void getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void getOddSum() {
        int oddSum = 0;
        for (int i = 1; i <= 100; i += 2) {

            oddSum += i;
        }
        System.out.println("oddSum = " + oddSum);
    }

}
