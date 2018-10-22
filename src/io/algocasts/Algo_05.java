package io.algocasts;

/**
 * 判断二叉树是否相等
 *
 * @auther williams
 * @create-time 2018-10-17-下午2:21
 */


public class Algo_05 {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public boolean isSameTreeRecursive(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return p.val==q.val && isSameTreeRecursive(p.left,q.left) && isSameTreeRecursive(p.right,q.right);
    }

    public static void main(String[] args) {
        Algo_05 algo = new Algo_05();

        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(6);
        root1.right = new TreeNode(6);
        root1.left.left = new TreeNode(5);
        root1.left.right = new TreeNode(7);
        root1.right.left = new TreeNode(8);
        root1.right.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(6);
        root2.right = new TreeNode(6);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(8);
        root2.right.right = new TreeNode(5);

        System.out.println(algo.isSameTreeRecursive(root1,root2));
    }


}
