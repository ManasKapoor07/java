
public class SortArrayRecursion {

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 5, 9, 6}; 

        sortArr(arr, arr.length - 1);

    }

    public static void sortArr(int[] arr, int n) {

        if (n == 1) {
            return;
        }
        // Take out last element
        int last = arr[n];
        //sort rest of the array

        sortArr(arr, n - 1);

        
    }
}
