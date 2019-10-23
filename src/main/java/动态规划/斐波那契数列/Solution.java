package 动态规划.斐波那契数列;

/**
 * @author guang
 * @since 2019-10-23 15:02
 */
public class Solution {

    /**
     * 空间复杂度 O(N)
     *
     * @param N
     * @return
     */
    public int fib(int N) {

        if (0 == N) {
            return 0;
        }

        int[] fibs = new int[N + 1];

        fibs[0] = 0;
        fibs[1] = 1;

        for (int i = 2; i <= N; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }

        return fibs[N];
    }

    public int fib2(int N) {

        if (0 == N) {
            return 0;
        }

        int a = 1;
        int b = 1;
        int c = 1;


        for (int i = 3; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int fib = solution.fib(30);
        int fib2 = solution.fib2(30);
        System.out.println("fib = " + fib);
        System.out.println("fib2 = " + fib2);
    }


}
