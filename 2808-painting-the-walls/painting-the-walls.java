class Solution {

    int[][] dp;

    int solve(int i, int remain, int[] cost, int[] time) {

        if (remain <= 0)
            return 0;

        if (i == cost.length)
            return (int)1e9;

        if (dp[i][remain] != -1)
            return dp[i][remain];

        int hire = cost[i] +
                solve(i + 1,
                      remain - 1 - time[i],
                      cost,
                      time);

        int skip = solve(i + 1,
                         remain,
                         cost,
                         time);

        return dp[i][remain] = Math.min(hire, skip);
    }

    public int paintWalls(int[] cost, int[] time) {

        int n = cost.length;

        dp = new int[n][n + 1];

        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);

        return solve(0, n, cost, time);
    }
}