package io.algocasts;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 *
 * @auther williams
 * @create-time 2018-10-22-下午3:55
 */


public class Algo_09 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

//    public ArrayList<Integer> PrintListReversingly(ListNode head){
//        Stack<Integer> s = new Stack<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for(ListNode p=head;p!=null;p=p.next){
//            s.push(p.val);
//        }
//        while (!s.isEmpty()) {
//            arrayList.add(s.pop());
//
//        }
//        return arrayList;
//    }

    public ArrayList<Integer> PrintListReversingly(ListNode head){
        Stack<ListNode> s = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(ListNode p=head;p!=null;p=p.next){
            s.push(p);
        }
        while (!s.isEmpty()) {
            arrayList.add(s.pop().val);

        }
        return arrayList;
    }

    public static void main(String[] args) {
        Algo_09 algo = new Algo_09();
        ListNode head = new ListNode(67);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(24);
        ListNode node4 = new ListNode(58);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(algo.PrintListReversingly((head)));
    }
}
