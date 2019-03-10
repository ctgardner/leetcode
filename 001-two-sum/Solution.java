import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        Hashtable<Integer, Integer> htable = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];
            if(htable.containsKey(diff)) {
                result[0] = htable.get(diff);
                result[1] = i;
                break;
            }
            else {
                htable.put(nums[i], i);
            }
        }
        
        return result;
    }
}
