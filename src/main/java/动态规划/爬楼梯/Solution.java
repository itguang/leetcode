package 动态规划.爬楼梯;

/**
 * @author guang
 * @since 2019-10-23 11:43
 */
public class Solution {

    /**
     * 1 -> 1
     * 2 -> 2
     * 3 -> 3
     * 4 -> 5
     * 5 ->
     */
    public static int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int result = climbStairs(5);
        System.out.println("result=====" + result);
    }

}
