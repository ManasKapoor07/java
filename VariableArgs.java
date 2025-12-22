public class VariableArgs {
    // Method to find the sum of variable number of integers
    public static int sum(int... numbers) {
        int total = 0;
        for (int num = 0; num <= numbers.length; num++) { // enhanced for loop to iterate through numbers
            // it iterates through each number in the numbers array
            total += num;
        }
        multipleArgs(10, "Hello", "dwdwdwdw", "wdwdwdw"); // calling method with multiple arguments
        return total;

    }

    public static void multipleArgs(int a, String... s) {
        // Method to demonstrate multiple arguments with variable arguments
        System.out.println("Integer argument: " + a);
        System.out.print("String arguments: " + String.join(", ", s));

        System.out.println();
    }

    public static void main(String[] args) {
        // sum method with different number of arguments
        System.out.println("Sum of 1, 2: " + sum(1, 2));
        System.out.println("Sum of 1, 2, 3, 4: " + sum(1, 2, 3, 4));
        System.out.println("Sum of 5, 10, 15, 20, 25: " + sum(5, 10, 15, 20, 25));
    }

}