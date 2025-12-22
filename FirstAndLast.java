
import java.util.Arrays;

public class FirstAndLast {

    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 12, 12};
        int start = 0;

        int end = arr.length - 1;
        int ans[] = new int[2];

        ans[0] = (firsstOccurence(arr, start, end, 10));
        ans[1] = (lastOccurence(arr, start, end, 10));
        System.out.println(Arrays.toString(ans));

    }

    public static int firsstOccurence(int arr[], int start, int end, int target) {
        //will keep on checking even if we get mid element as our target
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int arr[], int start, int end, int target) {
        //will keep on checking even if we get mid element as our target
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
