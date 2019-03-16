class Solution {
    public int removeDuplicates(int[] nums) {
        int displacement = 0;
        for(int i = 1; i < nums.length; ++i) {
            if(nums[i - 1] == nums[i]) {
                ++displacement;
            }
            else {
                nums[i - displacement] = nums[i];
            }
        }

        return nums.length - displacement;
    }
}