package io.algocasts;

/**
 * 二叉搜索树中查询数字
 *
 * @auther williams
 * @create-time 2018-11-25-下午9:12
 */


public class Algo_45 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode searchNumberInBST(TreeNode root, int target){
        if(root == null || target == root.val){
            return root;
        }
        else if(target < root.val){
            return searchNumberInBST(root.left,target);
        }
        else{
            return searchNumberInBST(root.right,target);
        }


    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        int target = 8;
        System.out.println(searchNumberInBST(root,target).val);
    }
}
