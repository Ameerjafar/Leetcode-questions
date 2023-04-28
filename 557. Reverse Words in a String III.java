class Solution {
       public String helper(String s){
        StringBuilder ans = new StringBuilder();
        String ans1 = "";
        int poitner = 0;
        while (poitner < s.length() && s.charAt(poitner) != ' '){
            ans.append(s.charAt(poitner));
            poitner++;
        }
        ans.reverse();
        ans1 += ans;
        ans = new StringBuilder();
        for(int i = poitner + 1; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                ans = ans.append(s.charAt(i));
                ans.reverse();
                ans1 += ans;
                ans = new StringBuilder();
            }
            else {
                ans.append(s.charAt(i));
            }
        }
        ans.reverse();
        if(poitner < s.length() - 1) {
            ans1 = ans1 + " " + ans;
        }
        return ans1;
    }
    public String reverseWords(String s) {
        return helper(s);
    }
}
