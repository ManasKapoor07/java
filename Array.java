
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        // Arrays are used to store multiple values in a single variable, instead of
        // declaring separate variables for each value.
        // depends on JVM that it is contiguous or non-contiguous memory allocation
        /*
         * Array objects are stored in heap memory
         * Reference variable is stored in stack memory
         * Heap objects are not contiguous, JVM handles it internally
         * Dynamic memory allocation is done by JVM
         * 
         */
        // Syntax array
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] num = new int[n]; // creating object in heap memory
        // array size is 5 here

        // int [] num2 = {1,2,3,4,5}; //declaration and initialization
        // input values in array
        System.out.println("Enter" + n + "  numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        System.out.println("Array elements are: ");
        // print array elements
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        //Enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int value : num) {
            System.out.println(value);
        }

        //Arrays.toString() method
        System.out.println("Using Arrays.toString() method:");
        System.out.println(java.util.Arrays.toString(num));

        //2D array
        // It is an array of arrays

        /*
        How it is stored in memory

            int[][] matrix = new int[3][3]; // 3 rows and 3 columns
            in heap memory 
            matrix[0] -> [1,2,3]
            matrix[1] -> [4,5,6]
            matrix[2] -> [7,8,9]
            matrix -> reference variable in stack memory
            matrix[0][1] -> 2
        */


        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Array elements are: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        // printing using Arrays.ToString() method
        System.out.println("Using Arrays.toString() method for 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(java.util.Arrays.toString(matrix[i]));
        }

    }
}
