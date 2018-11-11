package io.algocasts;

/**
 * 连续子序列的最大和
 *
 * @auther williams
 * @create-time 2018-11-11-下午3:19
 */


public class Algo_16 {

    public static int maxSumOfSubArray(int[] nums){
        int max = Integer.MIN_VALUE,cur = 0;
        for(int n :nums){
            cur = cur <= 0 ? n:(cur+n);
            max = Math.max(max,cur);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,-2,3,10,-4,7,2,-5};
        System.out.println(maxSumOfSubArray(nums));
    }
}
