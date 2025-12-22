
public class MaxWealth {

    public static void main(String[] args) {
        int arr[][] = {
            {1, 5 , 2}, {7, 3 , 10}, {3, 5 , 4}
        };

        System.out.println(maxWealth(arr));

    }

    public static int maxWealth(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
               rowSum += arr[i][j];
            }
           
            if(rowSum > max)
            {
                max = rowSum;
            }

        }
        return max;
    }
}
