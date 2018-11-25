package io.algocasts;

/**
 * 单链表删除指定数字
 * @auther williams
 * @create-time 2018-11-22-下午10:27
 */


public class Algo_41 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode remove(ListNode head,int target){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;

        while(p.next != null){
            if(p.next.val == target){
                p.next = p.next.next;
            }
            else {
                p = p.next;
            }

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int target = 1;

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
//        System.out.println(remove(head,target).val);
//        System.out.println(remove(head,target).next.val);

        ListNode H = remove(head,target);

        while(H != null){
            System.out.println(H.val);
            H = H.next;
        }







    }
}
