package 滑动窗口239;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * @author itguang
 * @date 2022-03-19 16:19
 */
public class Solution {
    public int[] maxSlidingWindow2(int[] nums, int k) {
        int n = nums.length;

        // 记录队列中每个元素的下标,因为 pq 不支持删除
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for (int i = 0; i < k; ++i) {
            // 往 pq 里面放了一个数组,第一个元素是指,第二个是下标
            // 其实,为了代码清晰,此处可以定义一个 对象 Node 来保存 元素和下标,删除的时候直接删除 node 即可
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];
        for (int i = k; i < n; ++i) {
            pq.offer(new int[]{nums[i], i});
            // 当前堆顶元素的数组下标不在滑动窗口里面,就把当前堆顶元素移走
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }

    /**
     * 输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
     * 输出：[3,3,5,5,6,7]
     * 解释：
     * 滑动窗口的位置                最大值
     * ---------------               -----
     * [1  3  -1] -3  5  3  6  7       3
     * 1 [3  -1  -3] 5  3  6  7       3
     * 1  3 [-1  -3  5] 3  6  7       5
     * 1  3  -1 [-3  5  3] 6  7       5
     * 1  3  -1  -3 [5  3  6] 7       6
     * 1  3  -1  -3  5 [3  6  7]      7
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/sliding-window-maximum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - (k - 1)];

        if (nums.length == 1) {
            return nums;
        }

        // 倒排序的 优先级队列
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() < k) {
                queue.offer(new Node(nums[i], i));
            } else {
                // 取出当前滑动窗口的最大值
                Node peekTopValue = queue.peek();
                res[i - k] = peekTopValue.getValue();

                // 删除 窗口前一个元素
                queue.remove(new Node(nums[i - k], i - k));

                // 再把当前元素加进去
                queue.offer(new Node(nums[i], i));

            }
            res[res.length - 1] = queue.peek().getValue();

        }

        return res;
    }

    class Node {
        private int value;
        private int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return value == node.value && index == node.index;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, index);
        }
    }

}
