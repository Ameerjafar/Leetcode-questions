import java.util.HashSet;
class Solution {
    public boolean helper(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i =0; i < nums.length; i++){
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
                count++;
            }
            else {
                set.add(nums[i]);
            }
        }
        if(count == nums.length / 2){
            return true;
        }
        return false;
    }
    public boolean divideArray(int[] nums) {
        return helper(nums);
    }
}
