import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input

        System.out.println("Enter name: ");
        String name = input.nextLine();// Reads string input

        // System.out.println("Your name is : " + name);



        // Type Conversion 
        //condition 1. Types must be compatible
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

       
        //condition 2. Left side type must be larger than right side type


        //Type Casting
        //Floating point to integer type
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9


        //Automatic type promotion in expressions
        int a = 257;
        byte b = (byte) a; // Manual casting from int to byte
        System.out.println(b); // Outputs 1 because 257 % 256 = 1
        //Explanation: byte can hold values from -128 to 127. When 257 is cast to byte, it wraps around.

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int result = x * y / z; // x and y are promoted to int before multiplication
        System.out.println(result); // Outputs 20





        //Conditional Statements
        /*
        if (condition) {
            // code to be executed if condition is true
        } else {
            // code to be executed if condition is false
        }
            
        switch (expression) {
            case value1:
                // code to be executed if expression equals value1
                break;
            case value2:
                // code to be executed if expression equals value2
                break;
            // you can have any number of case statements
            default:
                // code to be executed if expression doesn't match any case
        }
        */


        /*
        
        loops
        // while loop
        while (condition) {
            // code to be executed
        }       


        // do-while loop
        do {
            // code to be executed
        } while (condition);   
         
        

        // for loop     
        for (initialization; condition; increment/decrement) {
            // code to be executed
        }   

        When to use which loop?
        - Use a "for" loop when the number of iterations is known beforehand.
        - Use a "while" loop when the number of iterations is not known and depends on a condition.
        - Use a "do-while" loop when you want the code block to execute at least once, regardless of the condition.
        */
    }


}