
public class LinearSearch {

    public static void main(String[] args) {
        //linear search
        int[] arr = {1, 2, 3, 23, 12, 23};
        int target = 23;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found in " + i);
            }   
        }

    }

}
