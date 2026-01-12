
public class CountGood {

    public static void main(String[] args) {
        int start = 0;
        long n = 2;
        long ans = (countGoodNum(start, n));

        System.out.println(ans);
    }

    public static long countGoodNum(int start, long  n) {
        if (start == n) {
            return 1;
        }

        long res;

        if (start % 2 == 0) {
            res = 5 * countGoodNum(start + 1, n);
        } else {
            res = 4 * countGoodNum(start + 1, n);
        }

        return res % 1_000_000_007;
    }

}
