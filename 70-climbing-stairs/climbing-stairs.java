class Solution {
    public int climbStairs(int n) {
        int[] distinctWays = new int[n+1];
        distinctWays[0] = 1;
        distinctWays[1] = 1;
        for(int i = 2; i <= n; i++) {
            distinctWays[i] = distinctWays[i-1] + distinctWays[i-2];
        }
        return distinctWays[n];
    }
}