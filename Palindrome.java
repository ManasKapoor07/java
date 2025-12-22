
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        //checking plaindrome 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check plaindrome : ");
        int number = input.nextInt();
        int original = number;
        int result = 0;
        if (number < 0) {
            System.out.println("Negative number which is not palindrome ");
        }
        while (number != 0) {

            int rem = number % 10;
            result = result * 10 + rem;
            number = number / 10;
        }
        System.out.println("sdsdwsds" + number);
        if (result == original) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
