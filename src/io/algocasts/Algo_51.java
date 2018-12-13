package io.algocasts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 合并两个二叉树
 * @auther williams
 * @create-time 2018-12-11-下午10:37
 */


public class Algo_51 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    /**
     *层序遍历辅助函数，用于验证结果，和本题无关
     * @param root
     * @return
     */
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

    public static TreeNode mergeTrees(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return null;
        if(root1 != null && root2 == null) return root1;
        if(root2 != null && root1 == null) return root2;
        else{
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left,root2.left);
            root1.right = mergeTrees(root1.right,root2.right);
            return root1;
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(5);
        root1.left.right = new TreeNode(7);
        root1.right.right = new TreeNode(9);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(6);
        root2.left.left= new TreeNode(8);

        TreeNode root = mergeTrees(root1,root2);

        System.out.println(PrintFromTopToBotton(root));
    }
}
