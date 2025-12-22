
public class irstNumber {

    public static void main(String[] args) {
        // int n = 10;
        System.out.println(sumOfNumber(8));

    }

    public static int sumOfNumber(int i) {
        if (i == 1) {
            return i;
        }
        // int sum = 0;
        // sum = sum + i;

        int sum = i;
        // // sum = sum + i;
        // System.out.println(sum);
        return sum + sumOfNumber(i - 1);
    }
}
