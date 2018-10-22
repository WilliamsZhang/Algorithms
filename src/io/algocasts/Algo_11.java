package io.algocasts;

import java.util.HashSet;

/**
 * 判断单链表是否有环
 *
 * @auther williams
 * @create-time 2018-10-22-下午5:32
 */


public class Algo_11 {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }

    }

    public boolean hasCycleWithHashSet(ListNode head){
        HashSet<ListNode> hashSet = new HashSet<>();
        for(ListNode p=head;p!=null;p=p.next){
            if(hashSet.contains(p)) {
                return true;
            } else {
                hashSet.add(p);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Algo_11 algo = new Algo_11();
        ListNode head = new ListNode(6);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(24);
        ListNode node4 = new ListNode(7);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println(algo.hasCycleWithHashSet(head));


    }
}
