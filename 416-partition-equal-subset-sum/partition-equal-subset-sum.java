class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If total sum is odd, cannot split into equal subsets
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        // dp[s] = true if subset with sum s is possible
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        // Apply 0/1 Knapsack (Subset Sum)
        for (int num : nums) {
            for (int s = target; s >= num; s--) {
                dp[s] = dp[s] || dp[s - num];
            }
        }

        return dp[target];
    }
}
