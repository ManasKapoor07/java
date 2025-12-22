
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = { 0};
        int start = 0;
        int end = arr.length-1;
        reverse(arr, start, end);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " "  );
        }
    }

    public static void reverse(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr, s + 1, e - 1);
    }
}
