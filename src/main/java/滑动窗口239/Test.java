package 滑动窗口239;

import org.junit.jupiter.api.Assertions;

/**
 * @author itguang
 * @date 2022-03-19 16:19
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test() {

        Solution solution = new Solution();
        int[] ints = solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        int[] res = new int[]{3, 3, 5, 5, 6, 7};
        Assertions.assertEquals(ints.length, res.length);
        for (int i = 0; i < ints.length; i++) {
            Assertions.assertEquals(ints[i], res[i]);
        }


    }
}
