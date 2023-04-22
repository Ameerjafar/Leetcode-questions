class Solution {
 int helper(String a,String b){
        int n=a.length();
        int m=b.length();
        int[][] dp=new int[a.length()+1][b.length()+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public int minInsertions(String s) {
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            s1+=s.charAt(i);
        }
        int ans=helper(s,s1);
        return s.length()-ans;
    }
}
