class Solution {
    public int removeElement(int[] nums, int val) {
        int displacement = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == val) {
                ++displacement;
            }
            else {
                nums[i - displacement] = nums[i];
            }
        }

        return nums.length - displacement;
    }
}