class Solution {
    public int findTargetSumWays(int[]a, int target) {
int sum=0;
for(int x:a) sum=sum+x;
if (Math.abs(target) > sum)
    return 0;
   if(sum+target<0) return 0;
   if((sum+target)%2!=0) return 0;
sum=(sum+target)/2;
        int n = a.length;
        int[][] dp = new int[n][sum + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(a, n, n - 1, sum, dp);
    }

    static int fun(int[] a, int n, int i, int sum, int[][] dp) {

        if (i == 0) {
            if (sum == 0 && a[0] == 0)
                return 2;

            if (sum == 0 || sum == a[0])
                return 1;

            return 0;
        }

        if (dp[i][sum] != -1)
            return dp[i][sum];

        int c1 = 0;

        if (a[i] <= sum)
            c1 = fun(a, n, i - 1, sum - a[i], dp);

        int c2 = fun(a, n, i - 1, sum, dp);

        return dp[i][sum] = c1 + c2;
    }
}
    