
public class SecondLargestDigit {

    public static void main(String[] args) {
        String s = "abc1111";

        int largest = secondLargest(s);
        System.out.println(largest - '0');

    }

    public static int secondLargest(String s) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (largest <= s.charAt(i)) {
                    secondlargest = largest;

                    largest = s.charAt(i);
                } else if (s.charAt(i) > secondlargest && s.charAt(i) != largest) {
                    secondlargest = s.charAt(i);
                }

            }

        }
        if (largest == secondlargest) {
            return -1;
        }
        return secondlargest;
    }
}
