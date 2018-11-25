package io.algocasts;

/**
 * 链表中倒数第k个节点(两次遍历链表)
 *
 * @auther williams
 * @create-time 2018-11-20-下午7:17
 */


public class Algo_31 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static int traversingLinkedList(ListNode head){
        int count = 0;
        for (ListNode p = head; p != null ; p = p.next) {
            count ++;
        }
        return count;
    }

    public static int findListK(ListNode head,int k){
        int n = traversingLinkedList(head) - k + 1;
//        int count = 0;
//        for (ListNode p = head; p != null ; p = p.next) {
//            count ++;
//            if(count == n){
//                return p.val;
//            }
//
//        }
//        return -1;
        ListNode tmp = head;
        for (int i = 1; i < n; i++) {
            tmp = tmp.next;

        }
        return tmp.val;
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
        System.out.println(findListK(head,5));

    }


}
