
import java.util.Arrays;

public class Concatenation {

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1};
        int ans[] = new int[(2 * arr.length)];
        //Brute force

        for (int i = 0; i <= arr.length - 1; i++) {
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
