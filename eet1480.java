
import java.util.Arrays;

public class eet1480 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runnigSum(arr)));
    }
    public static int[] runnigSum(int arr[])
    {
        int sum = 0;
        int ans[] =  new int [arr.length];
        for(int i = 0; i< arr.length; i++)
        {
            sum = sum + arr[i];
            ans[i] = sum;
        }
        return ans;
    }
}
