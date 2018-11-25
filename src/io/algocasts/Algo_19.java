package io.algocasts;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 剑指offer 面试题６：从尾到头打印链表
 *
 * @auther williams
 * @create-time 2018-11-17-下午4:54
 */


public class Algo_19 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static ArrayList<Integer> PrintListReversingly(ListNode head){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (ListNode p = head; p != null; p = p.next) {
            stack.push(p.val);
        }

        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(67);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(24);
        ListNode node4 = new ListNode(58);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(PrintListReversingly(head));
    }



}
