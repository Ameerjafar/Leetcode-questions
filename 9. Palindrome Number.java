class Solution {
     public  boolean helper(int x){
        int ans1 = x;
        if(x != Math.abs(x)){
            return false;
        }
        int ans = 0;
        while(x!=0){
            int rem = x % 10;
            ans = ans * 10 + rem;
            x = x/10;
        }
        if(ans == ans1){
            return true;
        }
        return false;
    }

    public boolean isPalindrome(int x) {
        return helper(x);
    }
}
