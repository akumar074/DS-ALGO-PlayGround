package DataStructures.Arrays;

import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }

    public static int maxSubArray(int[] nums) {
        int curr_max = nums[0];
        int max_so_far = nums[0];
        for (int i = 0; i < nums.length; i++) {
            curr_max = Math.max(curr_max + nums[i], nums[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}
