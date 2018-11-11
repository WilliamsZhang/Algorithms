package io.algocasts;

/**
 * 缺失的数字
 *
 * @auther williams
 * @create-time 2018-11-11-上午11:33
 */


public class Algo_13 {

    public static int missingNumber(int nums[]){
        int n = nums.length;
        int result = n;

        for(int i=0;i<n;i++){
            result ^= i^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));

    }
}
