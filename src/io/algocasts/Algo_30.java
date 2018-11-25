package io.algocasts;

/**
 * 剑指offer 面试题18:删除链表的节点
 * 目前无法删除头结点
 * @auther williams
 * @create-time 2018-11-20-下午3:16
 */


public class Algo_30 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

//    public static void delete(ListNode head,int target){
////        ListNode tummp = new ListNode(-1);
////        tummp.next = head;
////
////        for (ListNode p = tummp; p != null; p = p.next) {
////            if(p.next.val == target){
////                ListNode TmpCell = p.next;
////                p.next = TmpCell.next;
////                break;
////            }
////        }
////    }

    public static ListNode delete(ListNode head,int target){
        ListNode tmp = head;
        if(head.val == target){
            return head.next;
        }
        else {
            while (tmp.next.val != target) {
                tmp = tmp.next;
            }
            ListNode TmpCell = tmp.next;
            tmp.next = TmpCell.next;

        }
        return head;
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

        delete(head, 9);
        while (head != null) {
             System.out.print(head.val);
             head = head.next;
         }


    }



}
