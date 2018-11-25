package io.algocasts;

/**
 * 移除单链表倒数第n个节点
 *
 * @auther williams
 * @create-time 2018-11-25-下午8:31
 */


public class Algo_43 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy,q = dummy;

        for(;n>0 && q.next != null; n--){
            q = q.next;
        }
        while(q.next != null){
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode H = removeNthFromEnd(head,4);

        while(H != null){
            System.out.println(H.val);
            H = H.next;
        }
    }
}
