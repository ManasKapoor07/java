
class Calculator {

    // Instance variable
    // Stored inside the Calculator object in HEAP memory
    int value = 4;

    // Method Overloading
    // Same method name, different parameter list
    public int add(int a, int b) {
        System.out.println(value);
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Oops {

    public static void main(String[] args) {

        // Local variables → stored in STACK
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        // calc → reference stored in STACK
        // new Calculator() → object stored in HEAP
        Calculator calc = new Calculator();

        // Method call → stack frame created
        int result1 = calc.add(num1, num2, num3);
        int result2 = calc.add(num1, num2);

        System.out.println(result1 + " " + result2);
    }
}
