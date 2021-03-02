package hashmap;

import java.util.HashMap;

/**
 * @Author guang
 * @Date 2021/2/27 11:11 上午
 */
public class HashMapTest {
    public static void main(String[] args) {
        int n = 8;
//        System.out.println(fib(n));
//        System.out.println(numWays(n));
//        System.out.println(cuttingRope(n));
        System.out.println(hammingWeight(3));
    }

    public static int hammingWeight(int n) {

        int flag = 1;
        int coutOf1 = 0;
        while (flag > 0) {
            if ((n & flag) > 0) {
                coutOf1++;
            }
            flag = flag << 1;
        }
        return coutOf1;

    }

    public static int cuttingRope(int n) {
        // 数学归纳法 -- 贪婪算法
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 1 * 2;
        }
        if (n == 4) {
            return 2 * 2;
        }

        int timeOf3 = 0;
        while (n >= 5) {
            timeOf3++;
            n = n - 3;
        }

        return (int) Math.pow(3, timeOf3) * n;

    }

    public static int numWays(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int a = 1;
        int b = 2;
        int sum = 0;
        for (int i = 3; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;

        }
        return sum;

    }

    public static int fib(int n) {

        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;

    }


}
