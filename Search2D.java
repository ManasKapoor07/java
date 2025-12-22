
public class Search2D {

    public static void main(String[] args) {
        //search in 2D arryas 
        int arr[][] = {
            {1, 2, 4, 9}, {12, 23, 32, 43}, {11, 33, 22, 11}
        };
        int target = 33;
        findNumber(arr, target);
    }

    public static void findNumber(int arr[][], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Target is at " + i + "," + j);
                }
            }
        }
    }
}
