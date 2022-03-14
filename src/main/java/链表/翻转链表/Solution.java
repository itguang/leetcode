package 链表.翻转链表;

import 链表.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author itguang
 * @date 2022-03-12 17:27
 */
class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        ListNode listNode = new Solution().reverseList(head);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


    /**
     * 思路：
     * 1. 从 给定列表中依次取一个 node 作为当前 node 叫做 curNode；记录移除了 curNode 之后的老的链表头部 nextNode。
     * 2. 将 curNode 的 next 指向 newHead，此时 的 curNode 就是 新的 newHead；
     * 3. 重复 Step1
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode newHead = null;
        ListNode curNode = head;
        ListNode nextNode;

        while (curNode != null) {
            // 1. 从 给定列表中依次取一个 node 作为当前 node 叫做 curNode；记录移除了 curNode 之后的老的链表头部 nextNode。
            nextNode = curNode.next;

            // 2. 将 curNode 的 next 指向 newHead，此时 的 curNode 就是 新的 newHead；
            curNode.next = newHead;
            newHead = curNode;

            // 开始下一次 取 node
            curNode = nextNode;
        }
        return newHead;

    }
}
