package io.algocasts;

/**
 * 链表划分
 * @auther williams
 * @create-time 2018-12-13-下午9:58
 */


public class Algo_53 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode divisionLinkNode(ListNode head,int target){
        ListNode smaller = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode sm = smaller;
        ListNode gr = greater;
        for(ListNode p = head; p!=null; p=p.next){
            if(p.val < target){
                sm.next = p;
                sm = sm.next;
            }
            else{
                gr.next = p;
                gr = gr.next;
            }
        }
        sm.next = greater.next;
        gr.next = null;
        return smaller.next;
    }

    public static void main(String[] args) {
        int target = 3;
        ListNode head = new ListNode(1);
        head.next = new ListNode(7);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(2);

        ListNode newListNode = divisionLinkNode(head,target);

        while(newListNode!=null){
            System.out.println(newListNode.val);
            newListNode = newListNode.next;
        }
    }

}
