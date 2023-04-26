class Solution {
    public int[] finalPrices(int[] prices) {

        for(int i =0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] >= prices[j]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}

// using stack 

class Solution {
  public  int[] helper(int[] nums){
        Stack<Integer> st = new Stack<>();
        for(int i =0; i < nums.length; i++){
            st.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        for(int i =0; i < nums.length; i++){
            ans[i] = -1;
        }
        int pointer = nums.length - 1;
        ans[pointer] = nums[nums.length - 1];
        st.pop();
        pointer --;
        while (!st.isEmpty()){
            for(int i = pointer + 1; i < ans.length; i++){
                if(st.peek() >= nums[i]){
                    ans[pointer] = st.peek() - nums[i];
                    break;
                }
            }
            if(ans[pointer] == -1){
                ans[pointer] = nums[pointer];
            }
            pointer --;
            st.pop();
        }
        return ans;
    }

    public int[] finalPrices(int[] prices) {
        return helper(prices);
    }
}
