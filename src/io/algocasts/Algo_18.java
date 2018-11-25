package io.algocasts;

import java.util.Arrays;

/**
 * 剑指offer 面试题4:二维数组中的查找
 *
 * @auther williams
 * @create-time 2018-11-16-下午7:59
 */


public class Algo_18 {
    public static int[] find(int[][] nums,int target){
        if(nums == null || nums.length == 0 || nums[0] == null || nums[0].length == 0){
            return new int[]{-1,-1};
        }
        int m = nums.length;
        int n = nums[0].length;
        int i = 0;
        int j = n-1;
        while(i<m && j>=0){
            if(target<nums[i][j]){
                j--;
            }
            else if(target>nums[i][j]){
                i++;
            }
            else{
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Arrays.toString(find(nums,7)));
    }
}
