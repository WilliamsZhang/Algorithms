package io.algocasts;

/**
 * 二叉树的最小深度
 *
 * @auther williams
 * @create-time 2018-12-11-下午9:37
 */


public class Algo_49 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left == null && root.right != null){
            return minDepth(root.right) + 1;
        }
        if(root.left != null && root.right == null){
            return minDepth(root.left) + 1;
        }
        else{
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(16);
        System.out.println(minDepth(root));

        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.right = new TreeNode(4);
        System.out.println(minDepth(root1));
    }
}
