package io.algocasts;

/**
 * 求两个单链表之和
 *
 * @auther williams
 * @create-time 2018-11-25-下午10:13
 */


public class Algo_46 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode addTwoLinkListNumber(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum % 10);
            p = p.next;
            carry = sum / 10;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(8);
        l2.next.next.next = new ListNode(9);

        ListNode H = addTwoLinkListNumber(l1,l2);
        while(H != null){
            System.out.println(H.val);
            H = H.next;
        }
    }
}
