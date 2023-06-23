package easy;

import java.util.Optional;

public class TwoSum {
    public static Optional<int[]> twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return Optional.of(new int[]{i, j});
                }
            }
        }
        return Optional.empty();
    }
}
