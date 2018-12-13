package io.algocasts;

/**
 * 单链表的中间节点（用快慢指针）
 *
 * @auther williams
 * @create-time 2018-12-13-下午9:43
 */


public class Algo_52 {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    /**
     * 用两次循环遍历
     * @param head
     * @return
     */
    public static ListNode middleNode(ListNode head){
        int len = 0;

        for(ListNode p = head;p!=null;p=p.next){
            len++;
        }
        ListNode p = head;
        for(int i=0;i<len/2;i++){
            p = p.next;
        }
        return p;
    }

    /**
     * 用快慢指针
     * @param head
     */
    public static ListNode middleNode2(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(9);
        System.out.println(middleNode(head).val);
        System.out.println(middleNode2(head).val);
    }
}
