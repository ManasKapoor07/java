
public class PowerOfTwo {

    public static void main(String[] args) {
        int n = 0;

        boolean result = pow(n);
        System.out.println(result);
    }

    public static boolean pow(int n) {

        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        return pow(n / 2);
    }
}
