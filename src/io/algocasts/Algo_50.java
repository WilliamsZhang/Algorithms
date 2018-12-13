package io.algocasts;

/**
 * 二叉树的最大深度
 *
 * @auther williams
 * @create-time 2018-12-11-下午9:48
 */


public class Algo_50 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static int maxDepth(TreeNode root){
        if(root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(15);
        System.out.println(maxDepth(root));

        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.right = new TreeNode(4);
        System.out.println(maxDepth(root1));
    }


}
