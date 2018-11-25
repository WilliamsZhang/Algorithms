package io.algocasts;


/**
 * 剑指offer 面试题27:二叉树的镜像
 *
 * @auther williams
 * @create-time 2018-11-21-下午4:34
 */


public class Algo_38 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode MirrorRecursively(TreeNode root){
        if(root == null) return root;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        MirrorRecursively(root.left);
        MirrorRecursively(root.right);
        return root;
    }



}
