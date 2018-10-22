package io.algocasts;

/**
 * 反转单链表
 *
 * @auther williams
 * @create-time 2018-10-20-下午10:47
 */


public class Algo_06 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static int reverseList(ListNode head) {
        //当前节点
        ListNode cur = head;
        //当前节点的前一节点
        ListNode pre = null;

        while (cur != null) {
            //要先记录一下当前节点的后一节点，防止链表断裂，链表丢失
            ListNode post = cur.next;
            cur.next = pre;
            pre = cur;
            cur = post;
        }
//        System.out.println(pre.val);
//        return pre;
        return pre.val;
    }

    public static void main(String[] args) {
//        Algo_06 algo =new Algo_06();
        // 功能测试：输入链表有多个节点
        // 链表 = 1->2->3->4->5->6
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println(reverseList(head));
    }
}

