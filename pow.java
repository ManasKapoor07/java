
public class pow {

    public static void main(String[] args) {
        double x = 2.00;
        int N = -200000000;

        long n = N;

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double ans = power(x, n);
        System.out.println(ans);

    }

    public static double power(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
