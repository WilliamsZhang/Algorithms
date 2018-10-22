package io.algocasts;

import java.util.Arrays;

/**
 * 在有序数组中求和为给定值的两个数
 * @auther williams
 * @create-time 2018-10-15-下午4:40
 */


public class Algo_02 {

    public int[] isTwoNumSum(int[] nums, int target){
        int i=0;
        int j=nums.length - 1;
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }
            if(nums[i]+nums[j]<target){
                i++;
            }
            else if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,9,14};
        int target = 13;
        Algo_02 algo = new Algo_02();
        int[] val = algo.isTwoNumSum(nums,target);
        System.out.println(Arrays.toString(val));
    }
}
