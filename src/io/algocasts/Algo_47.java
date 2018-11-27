package io.algocasts;

/**
 * 买卖股票的最大利润
 *
 * @auther williams
 * @create-time 2018-11-27-下午10:46
 */


public class Algo_47 {
    // O(n^2)
    public static int maxDiff(int[] nums){
        int len = nums.length;
        int maxD = 0;
        if(len < 2){
            return 0;
        }
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                maxD = Math.max(maxD,nums[j]-nums[i]);
            }
        }
        return maxD;
    }

    // O(n)
    public static int maxDiff2(int[] nums){
        int len = nums.length;
        int maxD = 0;
        if(len < 2){
            return 0;
        }

        int buyPrice = nums[0];
        for(int i=1;i<len;i++){
            if(nums[i] < buyPrice){
                buyPrice = nums[i];
            }
            else{
                maxD = Math.max(maxD,nums[i] - buyPrice);
            }
        }
        return maxD;
    }

    public static void main(String[] args) {
        int[] nums = {9,3,7,5,1,8};
        System.out.println(maxDiff(nums));
        System.out.println(maxDiff2(nums));
    }


}
