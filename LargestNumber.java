import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.println(findLargestNumber(num1, num2, num3));

    }

    public static int findLargestNumber(int a, int b, int c) {
        int largest = a;
       if (b >= largest && b >= c) {
            return b;
        } else if (c >= largest && c >= b) {
            return c;
        }
        return largest;
    }

    
}