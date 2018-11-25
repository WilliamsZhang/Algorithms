package io.algocasts;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 剑指offer 面试题7:重建二叉树
 *　输入前序遍历序列和其开始和结束的下标，中序遍历序列的开始下标和一个哈希表
 * @auther williams
 * @create-time 2018-11-17-下午5:27
 */


public class Algo_20 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode buildTree(int[] pre, int preStart, int endStart, int inStart, Map<Integer,Integer> inPos){
        if(preStart>endStart){
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        int rootIdx = inPos.get(pre[preStart]);
        int leftLen = rootIdx - inStart;
        root.left = buildTree(pre,preStart+1,preStart+leftLen,inStart,inPos);
        root.right = buildTree(pre,preStart+leftLen+1,endStart,rootIdx+1,inPos);
        return root;
    }

    public static TreeNode buildTree(int[] pre,int[] in){
        Map<Integer,Integer> inPos = new HashMap<>();
        for(int i=0;i<in.length;i++){
            inPos.put(in[i],i);
        }
        return buildTree(pre,0,pre.length-1,0,inPos);
    }

    public static void levelTraversal(TreeNode root){
        if(root==null) {
            return ;
        }

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.remove();
            System.out.print(cur.val+" ");
            if(cur.left!=null) {
                queue.add(cur.left);
            }
            if(cur.right!=null) {
                queue.add(cur.right);
            }

        }
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        // 重建二叉树后，使用宽度遍历进行输出测试
        levelTraversal(buildTree(pre,in));

    }


}
