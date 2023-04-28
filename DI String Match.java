class Solution {
    public int[] helper(String s){
        int[] ans = new int[s.length() + 1];
        int pointer = s.length();
        int pointer1 = 0;
        for(int i = 0; i < s.length() + 1; i++){
            if(i < s.length() && s.charAt(i) == 'D') {
                ans[i] = pointer;
                pointer--;
            }
            else {
                ans[i] = pointer1;
                pointer1++;
            }
        }
        return ans;
    }

    public int[] diStringMatch(String s) {
        return helper(s);
    }
}
