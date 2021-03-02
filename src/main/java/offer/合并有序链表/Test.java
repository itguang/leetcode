package offer.合并有序链表;

import 链表.ListNode;

/**
 * @Author guang
 * @Date 2021/2/28 7:17 下午
 */
public class Test {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        l1.next = listNode2;
        ListNode listNode3 = new ListNode(4);
        listNode2.next = listNode3;


        ListNode l2 = new ListNode(1);
        ListNode l2_2 = new ListNode(3);
        l2.next = l2_2;
        ListNode l2_3 = new ListNode(4);
        l2_2.next = l2_3;


        mergeTwoLists(l1, l2);


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode merge_head = new ListNode(-1);
        ListNode merge_tail = merge_head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                merge_tail.next = l1;
                merge_tail = l1;
                l1 = l1.next;
            } else {
                merge_tail.next = l2;
                merge_tail = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            merge_tail.next = l1;
        } else {
            merge_tail.next = l2;
        }

        return merge_head.next;


    }
}
