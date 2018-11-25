package io.algocasts;

/**
 * 链表中倒数第k个节点（遍历一次这个链表）
 *
 * @auther williams
 * @create-time 2018-11-21-上午10:59
 */


public class Algo_32 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static int findListK(ListNode head,int k){
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k-1 ; i++) {
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(9);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(findListK(head,3));
    }
}
