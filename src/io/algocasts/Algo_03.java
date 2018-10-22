package io.algocasts;

/**
 * 判断二叉树是否对称
 * @auther williams
 * @create-time 2018-10-15-下午4:51
 */


public class Algo_03 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymetric(TreeNode s,TreeNode t){
        if(s!=null && t!=null){
            return s.val == t.val && isSymetric(s.left,t.right) && isSymetric(s.right,t.left);
        }
        else {
            return s==null && t==null;
        }
    }

    public boolean isSymmetricTreeRecursive(TreeNode root){
        if(root==null) {
            return true;
        }
        return isSymetric(root.left,root.right);
    }

    public static void main(String[] args) {

        Algo_03 algo = new Algo_03();

        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(6);
        root1.right = new TreeNode(6);
        root1.left.left = new TreeNode(5);
        root1.left.right = new TreeNode(7);
        root1.right.left = new TreeNode(8);
        root1.right.right = new TreeNode(5);
        System.out.println(algo.isSymmetricTreeRecursive(root1));

    }



}
