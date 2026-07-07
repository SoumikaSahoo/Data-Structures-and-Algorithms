class Solution {
    HashMap<Integer, Integer> dp = new HashMap<>();

    int fun(int i, int n) {
        if (i == n) return 1;
        if (i > n) return 0;

        if (dp.containsKey(i))
            return dp.get(i);

        int ans = fun(i + 1, n) + fun(i + 2, n);

        dp.put(i, ans);

        return ans;
    }

    public int climbStairs(int n) {
        return fun(0, n);
    }
}