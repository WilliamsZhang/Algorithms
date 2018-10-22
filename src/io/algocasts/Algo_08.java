package io.algocasts;

import java.util.Stack;

/**
 * 判断单链表是否为回文链表
 *
 * @auther williams
 * @create-time 2018-10-21-上午1:22
 */


public class Algo_08 {
    public static class ListNode {
      int val;
      ListNode next;

      ListNode(int x) {
        val = x;
      }
    }


    public boolean isPalindromeUsingStack(ListNode head) {
        Stack<Integer> s = new Stack<>();
        for (ListNode p = head; p != null; p = p.next) {
            s.push(p.val);
        }

        for (ListNode p = head; p != null; p = p.next) {
            if (p.val != s.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Algo_08 algo = new Algo_08();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(1);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(algo.isPalindromeUsingStack(head));
    }
}
