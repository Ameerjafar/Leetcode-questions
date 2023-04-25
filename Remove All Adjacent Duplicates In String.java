class Solution {
   public  String helper(String s){
        Stack<Character> st = new Stack<>();
        for(int i =0; i < s.length(); i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }
            else {
                st.add(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
        return ans.toString();
    }
    public String removeDuplicates(String s) {
        return helper(s);
    }
}
