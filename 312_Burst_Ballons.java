class Solution {
    public int maxCoins(int[] nums) {
        int m = nums.length;
        int[] arr = new int[m+2];
        arr[0]=1;
        arr[m+1]=1;
        for(int i=0;i<m;i++){
            arr[i+1]=nums[i];
        }
        int[][] dp = new int[m+2][m+2];
        

        for(int len=1;len<=m;len++){
            for(int i=1;i<=m-len+1;i++){
                int j = i+len-1;

                for(int k=i;k<=j;k++){
                    int maxCoins = dp[i][k-1] + dp[k+1][j]+arr[i-1]*arr[j+1]*arr[k];
                    dp[i][j]=Math.max(dp[i][j],maxCoins);
                }
            }
        }
        return dp[1][m];
        
        
    }
}