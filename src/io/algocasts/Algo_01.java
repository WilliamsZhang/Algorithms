package io.algocasts;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 求和为给定值的两个数
 *
 * @auther williams
 * @create-time 2018-10-14-下午3:39
 */


public class Algo_01 {

    //暴力破解法，两次 for 循环

    public int[] getTwoNumberBruteForce(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    //一遍Hash表

    public int[] getTwoNumberHashMap(int[] nums,int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int numNeeded = target - nums[i];
            if(hashMap.containsKey(numNeeded)){
               return new int[]{i,hashMap.get(numNeeded)};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }


    public static void main(String[] args) {
        Algo_01 algo = new Algo_01();
        int[] nums= {1,2,4,8,9};
        int target = 11;
        int[] m = algo.getTwoNumberHashMap(nums,target);
        int[] n = algo.getTwoNumberBruteForce(nums,target);
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(n));
    }


}
