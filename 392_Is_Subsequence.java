class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int count = 0;

        int[][] dp = new int[n+1][m+1];
        int i=0,j=0;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                count+=1;
            }else{
                j++;
            }
        }
        if(count==n){
            return true;
        }
        return false;

    }
}
