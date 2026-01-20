
import java.util.Arrays;
import java.util.HashMap;

class TwoSum {

    public static void main(String[] args) {

        int arr[] = {2, 3, 3};

        int target = 6;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        //basic approach o(n2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }

    public static int[] twoSumMap(int[] nums, int target) {
        //Hashmap approach
        //O(n) TC 
        //O(n) SC
        HashMap<Integer, Integer> map = new HashMap<>();

        //idea is to find complement 
        //complement = target - arr[i];
        //if complement is pesent in map return , if not store it in map
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Step 1: check
            map.put(nums[i], i);

            if(map.containsKey(complement))
            {
                return new int[] {map.get(complement) , i};
            }

            //Step 2: store AFTER checking


        }
        return new int[] { -1,-1};

    }
}
