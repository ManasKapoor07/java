import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        // Print Fibonacci
        int n = 0;
        int a = 1;
        int b = 1;
        int result = 0;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        System.out.println("Enter a sum to get its term");
        int sumTill = input.nextInt();

        if (n <= 0) {
            System.out.println("Number entered less than or equal to 0");
            System.out.println(a);
            return;
        }

        if (n >= 1) {
            System.out.println(a + " ");
        }
        if (n >= 2) {
            System.out.println(b + " ");
        }
        for (int i = 3; i <= n; i++) {

            result = a + b;
            System.out.println(result);

            if (result == sumTill) {
                System.out.println(i + " " + "This is the nth term of the series");
            }
            else{
                System.out.println("No term found for the given sum ");
            }
            a = b;
            b = result;
        }

    }


}