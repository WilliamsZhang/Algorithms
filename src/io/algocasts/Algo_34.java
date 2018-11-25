package io.algocasts;

/**
 * 剑指offer 面试题26:树的子结构
 *
 * @auther williams
 * @create-time 2018-11-21-下午1:46
 */


public class Algo_34 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }


//    public static  boolean equals(double num1,double num2) {
//        if((num1 - num2 > -0.0000001) && (num1 - num2 < 0.0000001)) return true;
//        return false;
//    }
//
//    public static boolean hasSubtree(TreeNode root1, TreeNode root2){
//        if(equals(root1.val,root2.val)){
//            return doesTree1HaveTree2(root1,root2);
//        }
//        else{
//            return hasSubtree(root1.left,root2) || hasSubtree(root1.right,root2);
//        }
//
//    }
//
//    public static boolean doesTree1HaveTree2(TreeNode root1,TreeNode root2){
//        if(root2 == null) return true;
//        if(root1 == null) return false;
//        if(!equals(root1.val,root2.val)) return false;
//        return doesTree1HaveTree2(root1.left,root2.left) && doesTree1HaveTree2(root1.right,root2.right);
//
////        if(root1.val == root2.val && doesTree1HaveTree2(root1.left,root2.left) && doesTree1HaveTree2(root1.right,root2.right)) return true;
////        return false;
//    }
//
//    public static void main(String[] args) {
//        // 树A
//        TreeNode root1 = new TreeNode (8);
//        root1.left = new TreeNode(8);
//        root1.right = new TreeNode(7);
//        root1.left.left = new TreeNode(9);
//        root1.left.right = new TreeNode(2);
//        root1.left.right.left = new TreeNode(4);
//        root1.left.right.right = new TreeNode(7);
//
//        // 树B
//        TreeNode root2 = new TreeNode(8);
//        root2.left = new TreeNode(9);
//        root2.right = new TreeNode(2);
//
//        // 树C
//        TreeNode root3 = new TreeNode(7);
//        root3.left = new TreeNode(4);
//        root3.right = new TreeNode(3);
//
//        System.out.println(hasSubtree(root1,root2));
//        System.out.println(hasSubtree(root1,root3));
//        System.out.println(hasSubtree(root2,root3));
//
//    }
//
}
