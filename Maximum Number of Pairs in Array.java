class Solution {
    public int[] helper(int[] nums) {
        HashSet<Integer> set =  new HashSet<>();
        int count = 0;
        for(int i =0; i < nums.length; i++){
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
                count ++;
            }
            else {
                set.add(nums[i]);
            }
        }
        int[] ans = new int[2];
        ans[0] = count;
        ans[1] = set.size();
        return ans;
    }
    public int[] numberOfPairs(int[] nums) {
        return helper(nums);
    }
}
