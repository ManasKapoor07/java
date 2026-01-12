
public class BinarySearchRecursion {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int start = 0;
        int end = arr.length - 1;
        int target = 0;
        System.out.println(binarySearch(arr, start, end, target));
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if(start > end)
        {
            return  -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, end, target);
        }
    }
}
