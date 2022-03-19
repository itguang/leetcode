package 第K大数值703;

import org.junit.jupiter.api.Assertions;

/**
 * @author itguang
 * @date 2022-03-19 10:56
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test() {

        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        Assertions.assertEquals(kthLargest.add(3), 4);
        Assertions.assertEquals(kthLargest.add(10), 5);

    }
}
