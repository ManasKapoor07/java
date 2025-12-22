public class ReverseInt {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        while (num != 0) {
            int rem = num % 10;
            System.out.println("Remainder: " + rem);
            reversed = reversed * 10 + rem;
            System.out.println("Reversed so far: " + reversed);
            num = num / 10;
            System.out.println("Remaining number: " + num);
        }
    }
}
