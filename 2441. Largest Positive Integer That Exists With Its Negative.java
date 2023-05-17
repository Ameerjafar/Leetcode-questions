class Solution {
    public int helper (int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == Math.abs(nums[i])) break;
            if(nums[i] != Math.abs(nums[i])) {
                set.add(nums[i]);
        }
    }
       for(int i = nums.length - 1; i >= 0; i--) {
           if(nums[i] == Math.abs(nums[i])) {
               if(set.contains(-nums[i])) {
                   return nums[i];
               }
           }
       }
       return -1;
    }
    public int findMaxK(int[] nums) {
        return helper (nums);
    }
}
