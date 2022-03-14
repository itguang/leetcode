package offer.删除链表的节点;

import 链表.ListNode;

import java.util.Queue;

public class Test {

    public static void main(String[] args) {


        ListNode l1 = new ListNode(4);
        ListNode listNode2 = new ListNode(5);
        l1.next = listNode2;
        ListNode listNode3 = new ListNode(1);
        listNode2.next = listNode3;
        ListNode listNode5 = new ListNode(9);
        listNode3.next = listNode5;

        deleteNode(l1,1);

    }

    public static ListNode deleteNode(ListNode head, int val) {

        if(head==null){
            return null;
        }
        if(head.val==val){
            return head.next;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        while(cur!=null && cur.val!=val){
//            pre.next = cur;
//            pre = pre.next;

            // 双指针解法
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return head;

    }
}
