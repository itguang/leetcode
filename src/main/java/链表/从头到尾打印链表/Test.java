package 链表.从头到尾打印链表;

import 链表.ListNode;

import java.util.Arrays;

/**
 * @Author guang
 * @Date 2021/2/28 9:59 上午
 */
public class Test {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;


        System.out.println(reversePrint(listNode1));
    }

    static int[] arr = null;
    static int count = 0;
    static int length = 0;
    public static int[] reversePrint(ListNode head) {
        // 递归


        if (head.next != null) {
            length++;
            reversePrint(head.next);
            count++;
        }
        if (arr ==null){
            arr = new int[length+1];
        }
        arr[count] = head.val;
        System.out.println(head.val);
        return arr;
    }
}
