package 动态规划.使用最小花费爬楼梯;

/**
 * dp[i] = Math.min(dp[i-2]+cost[i],dp[i-1]+cost[i]);
 *
 * @author guang
 * @since 2019-10-23 16:43
 */
public class Solution {

    public static int minCostClimbingStairs2(int[] cost) {

        //记录每个台阶最小花费
        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }
        //在最后两个台阶中选个最小的登顶，结束
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int result = minCostClimbingStairs2(cost);
        System.out.println("result = " + result);
    }

}
