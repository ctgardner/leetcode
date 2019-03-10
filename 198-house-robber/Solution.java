import java.util.*;

class Solution {
    public int rob(int[] nums) {
        return rob(nums, new HashMap<>(), 0);
    }

    private int rob(int[] nums, HashMap<Integer, Integer> memo, int startIndex) {
        if(startIndex >= nums.length) {
            return 0;
        }

        if(startIndex == nums.length - 1) {
            return nums[startIndex];
        }

        Integer result = memo.get(startIndex);
        if(result == null) {
            result = Math.max(
                    nums[startIndex] + rob(nums, memo, startIndex + 2),
                    nums[startIndex + 1] + rob(nums, memo, startIndex + 3)
            );
            memo.put(startIndex, result);
        }

        return result;
    }
}
