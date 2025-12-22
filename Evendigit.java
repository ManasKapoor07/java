
public class Evendigit {

    public static void main(String[] args) {
        int arr[] = {555, 901, 482, 1771};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digitCount = 0;
            while (nums[i] != 0) {

                digitCount++;

                System.out.println(digitCount + " of " + nums[i]);
                nums[i] = nums[i] / 10;

            }
            if (digitCount % 2 == 0) {
                count++;
            }

        }
        return count;
    }
}
