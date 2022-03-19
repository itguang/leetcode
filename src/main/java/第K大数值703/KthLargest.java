package 第K大数值703;

import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/jBjn9C/
 *
 * @author itguang
 * @date 2022-03-19 10:56
 */
class KthLargest {

    /**
     * 知识点:
     */

    private PriorityQueue<Integer> priorityQueue;
    private int k;

    public KthLargest(int k, int[] nums) {

        // 默认小顶堆
        this.priorityQueue = new PriorityQueue<>(k);
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }

    }

    public int add(int val) {
        if (priorityQueue.size() < k) {
            priorityQueue.offer(val);
        } else if (val > priorityQueue.peek()) {
            // priorityQueue 本身还是个队列,不是小顶堆的数据结构,不会自动排序删除多余元素.
            // priorityQueue 大小超过 k 再继续offer,会自动扩容
            priorityQueue.poll();
            // 添加新元素
            priorityQueue.offer(val);
        }

        return priorityQueue.peek();

    }
}
