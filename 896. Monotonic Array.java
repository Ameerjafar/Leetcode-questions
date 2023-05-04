class Solution {
    public boolean increasing(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;
    }
    public boolean decreasing(int[] nums) {
          for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                return false;
            }
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        if(increasing(nums) || decreasing(nums)) {
            return true;
        }
        return false;
    }
}
