
public class OneToN {

    public static void main(String[] args) {
        int n = 7;
        //choices ? 
        // 1 2 3 4

        //decision
       printOneToN(n);
    }

    private static void printOneToN(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        printOneToN(n - 1);
    }
}
