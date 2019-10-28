package 堆.优先级队列;

import java.util.PriorityQueue;

/**
 * @author guang
 * @since 2019-10-28 14:38
 */
public class PriorityQueuetest {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(6);
        queue.add(2);
        queue.add(3);
        queue.add(9);
        queue.add(5);

        Integer poll = queue.poll();

        System.out.println("poll=" + poll);
    }
}
