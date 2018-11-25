package io.algocasts;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指offer 面试题32:从上到下打印二叉树(层序遍历)
 *
 * @auther williams
 * @create-time 2018-11-17-下午10:45
 */


public class Algo_21 {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static ArrayList<Integer> PrintFromTopToBotton(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
//        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode result = queue.poll();
            arrayList.add(result.val);

            if(result.left!=null){
                queue.add(result.left);
            }
            if(result.right!=null){
                queue.add(result.right);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(10);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(11);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println(PrintFromTopToBotton(root));
     }
}
