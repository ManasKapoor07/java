
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};

        //base condition   
        System.out.println(Arrays.toString(reverseString(s, 0, s.length - 1)));

    }

    public static char[] reverseString(char[] s, int start, int end) {

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;

    }
}
