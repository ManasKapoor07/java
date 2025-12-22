import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        String num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = input.next();
        char j = input.next().charAt(0);
        
        // Basic logic
        System.out.println(j);
        int count = 0;

        for (int i = 0; i < num.length(); i++) {
            // System.out.println(i);
            if (num.charAt(i) == j) {
                count++;
            }
        }
        System.out.println(count);

    }

}

