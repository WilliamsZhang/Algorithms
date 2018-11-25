package io.algocasts;

/**
 * 有序链表去重
 *
 * @auther williams
 * @create-time 2018-11-25-下午8:45
 */


public class Algo_44 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode removeRepeatNumber(ListNode head){
        ListNode p = head,q = head.next;

        while(q != null){
            if(p.val == q.val){
                p.next = q.next;
            }
            else{
                p = p.next;
            }
            q = q.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode H = removeRepeatNumber(head);
        while(H != null){
            System.out.println(H.val);
            H = H.next;
        }
    }
}
