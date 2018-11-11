package io.algocasts;

/**
 * 合并两个递增排序的链表
 *
 * @auther williams
 * @create-time 2018-11-11-下午2:31
 */


public class Algo_15 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            }
            else if(l1.val > l2.val){
                    p.next = l2;
                    l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 == null) {
            p.next = l2;
        } else {
            p.next = l1;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        l1.next = node2;

        ListNode l2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(6);
        l2.next = node3;
        node3.next = node4;

        ListNode dummy = mergeTwoSortedLists(l1,l2);


        while(dummy!=null){
            System.out.println(dummy.val);
            dummy = dummy.next;
        }
     }
}
