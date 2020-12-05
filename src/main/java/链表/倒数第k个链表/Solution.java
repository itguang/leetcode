package 链表.倒数第k个链表;


import 链表.ListNode;

class Solution {
    String str;

    public ListNode getKthFromEnd(ListNode head, int k) {

        if (head == null) {
            return null;
        }
        if (k < 1) {
            throw new UnsupportedOperationException("k 不能小于0");
        }

        // 长度判断
        int length = 1;
        ListNode t = head;
        while (t.next != null) {
            length++;
            t = t.next;
        }
        if (k > length) {
            throw new UnsupportedOperationException("k 不能大于链表的长度");
        }

        ListNode p1;
        ListNode p2;

        ListNode step = head;

        // p1 先走 k 步
        for (int n = 1; n < k; k--) {
            step = step.next;
        }

        p1 = step; // p1 先走 k 步
        p2 = head;
        // p1 ,p2 一起走，当 p1 到达链表末尾后，p2 就正好在倒数第k个节点上
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        // 打印 p2

        return p2;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        ListNode node6 = new ListNode(6);
        node5.next = node6;
        ListNode node7 = new ListNode(7);
        node6.next = node7;
        ListNode node8 = new ListNode(8);
        node7.next = node8;

        Solution solution = new Solution();
        ListNode kthFromEnd = solution.getKthFromEnd(node1, 10);

        ListNode next = kthFromEnd;
        while (next.next != null) {
            System.out.print(next.val + "->");
            next = next.next;
        }
        System.out.print(next.val);

        System.out.println();
    }
}
