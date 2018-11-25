package io.algocasts;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 *
 * @auther williams
 * @create-time 2018-11-21-下午3:57
 */


public class Algo_35 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static void preorder(TreeNode root, List<Integer> result){
        if(root == null) return ;
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);
    }

    public static List<Integer> preorderTraversalRecursive(TreeNode root){
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.right = node3;
        node3.left = node4;
        System.out.println(preorderTraversalRecursive(root));

    }

}
