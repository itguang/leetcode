package offer.翻转链表;

import 链表.ListNode;

import java.util.List;

/**
 * @Author guang
 * @Date 2021/2/28 3:12 下午
 */
public class Test {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;

        ListNode listNode = reverseList(listNode1);
        System.out.println(listNode);

    }
    public static ListNode reverseList(ListNode head) {

        if (head==null){
            return null;
        }

       ListNode new_head= null;
       ListNode odl_head = null;
       while(head.next!=null){

          odl_head = head.next; //2

           head.next = new_head;
           new_head =  head; //1

          head = odl_head;

       }
       head.next = new_head;

       return head;

    }
}
