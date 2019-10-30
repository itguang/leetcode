package 回溯算法.背包0_1;

/**
 * @author guang
 * @since 2019-10-30 10:56
 */
public class Solution {


    // 回溯算法实现。注意：我把输入的变量都定义成了成员变量。

    /**
     * 物品重量
     */
    int[] things = {2, 2, 4, 6, 3};

    /**
     * 背包承受的最大重量
     */
    private int MAX_WEIGHT = 9;

    private int result = 0;

    /**
     * 备忘录，默认值false
     */
    private boolean[][] mem = new boolean[5][10];

    /**
     * @param i  第几个物品
     * @param cw 当前容量
     */
    public void fun(int i, int cw) {
        System.out.println("i=" + i + " , cw=" + cw);

        //检查 cw
        // 检查 i 值
        // 结束条件: cw达到最大容量 或者 东西已经装完
        if (MAX_WEIGHT == cw || i == things.length) {
            // result 为 已经 记录所装载的最大容量,因此只有 cw >result 并且 cw <=MAX_WEIGHT 时,才更新 result 的值
            if (cw > result && cw <= MAX_WEIGHT) {
                result = cw;
            }
            return;
        }

        // 第i个物品有两种状态: 装与不装

        // 不装第i个物品
        fun(i + 1, cw);

        // 装第i个物品
        fun(i + 1, cw + things[i]);
    }

    /**
     * 带备忘录的递归回溯
     *
     * @param i  第几个物品
     * @param cw 当前容量
     */
    public void fun2(int i, int cw) {
        System.out.println("i=" + i + " , cw=" + cw);
        //检查 cw
        // 检查 i 值
        // 结束条件: cw达到最大容量 或者 东西已经装完
        if (MAX_WEIGHT == cw || i == things.length) {
            // result 为 已经 记录所装载的最大容量,因此只有 cw >result 并且 cw <=MAX_WEIGHT 时,才更新 result 的值
            if (cw > result && cw <= MAX_WEIGHT) {
                result = cw;
            }
            return;
        }

        // 第i个物品有两种状态: 装与不装

        // 备忘录(记录重复状态)
        if (mem[i][cw]) {
            return;
        }
        mem[i][cw] = true;

        // 不装第i个物品
        fun(i + 1, cw);

        // 装第i个物品
        if (cw + things[i] <= MAX_WEIGHT) {
            fun(i + 1, cw + things[i]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.fun2(0, 0);
        System.out.println("result=" + solution.result);
    }
}
