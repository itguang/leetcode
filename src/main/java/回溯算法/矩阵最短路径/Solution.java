package 回溯算法.矩阵最短路径;

/**
 * @author guang
 * @since 2019/11/1 10:01 上午
 */
public class Solution {

    private static int minDist = Integer.MAX_VALUE;
    private static int[][] matrix = {
            {1, 3, 5, 9},
            {2, 1, 3, 4},
            {5, 2, 6, 7},
            {6, 8, 4, 3}
    };

    private static int n = matrix[0].length - 1;

    /**
     * 回溯法: 从 matrix[0][0] 开始
     * 相当于穷举,时间复杂度 O(n*n)
     */
    public void fun2(int x, int y, int cDist) {

        if (x == n && y == n) {
            if (cDist < minDist) {
                minDist = cDist;
            }
        }

        // 右 y+1
        if (y < n) {
            fun2(x , y+1,  matrix[x ][y+1]+cDist);
        }

        // 下 x+1
        if (x < n) {
            fun2(x+1, y , matrix[x+1][y] + cDist);
        }


    }

    /**
     * f(x,y) = f(x-1,y)+f(x,y-1)+matrix[x,y]
     */
    public int fun(int x, int y) {


        if (x == 0 && y == 0) {
            return matrix[0][0];
        }
        if (x == 0 && y - 1 > 0) {
            return fun(x, y - 1);
        }
        if (y == 0 && x - 1 > 0) {
            return fun(x - 1, y);
        }

        return fun(x - 1, y) + fun(x, y - 1) + matrix[x][y];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.fun2(0, 0, matrix[0][0]);
        System.out.println(minDist);
    }

}
