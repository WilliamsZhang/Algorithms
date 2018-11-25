package io.algocasts;

/**
 * 二叉搜索树的后序遍历序列
 *
 * @auther williams
 * @create-time 2018-11-21-下午6:57
 */


public class Algo_39 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    TreeNode min(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    TreeNode max(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }

    public boolean VerifySquenceOfBST(TreeNode root){
        if(root == null) return true;
        boolean leftValid =   root.left == null || root.val>max(root.left).val;
        boolean rightValid =  root.right == null || root.val<min(root.right).val;
        return leftValid && rightValid && VerifySquenceOfBST(root.left) && VerifySquenceOfBST(root.right);
    }

    public static void main(String[] args) {
        Algo_39 algo = new Algo_39();
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        System.out.println(algo.VerifySquenceOfBST(root));
    }




}
