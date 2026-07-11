class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum = 0;
for (int x : nums)
    sum += x;
    if (sum % 2 != 0)
    return false;

sum /= 2;
        boolean[][]dp=new boolean[n+1][sum+1];
        dp[n][0]=true;
        for(int i=n-1;i>=0;i--){
            for(int s=0;s<=sum;s++){
                if(nums[i]>s){
                    dp[i][s]=dp[i+1][s];
                }else{
                    boolean c1=dp[i+1][s-nums[i]];
                    boolean c2=dp[i+1][s];
                    dp[i][s]=c1||c2;
                }
            }
        }
        return dp[0][sum];
        
    }
}