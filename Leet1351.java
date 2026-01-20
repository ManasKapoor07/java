public class Leet1351 {
    public static void main(String[] args) {
        int [] [] nums = {{3,2},{1,0}};
        System.out.println(countNegatives(nums));
    }
    public static  int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
