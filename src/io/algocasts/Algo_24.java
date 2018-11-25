package io.algocasts;

/**
 * 旋转数组的最小数字
 *
 * @auther williams
 * @create-time 2018-11-18-下午8:15
 */


public class Algo_24 {
    public static int Min(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int mid = low;
        while(nums[low]>nums[high]){
            if(high - low == 1){
                mid = high;
                break;
            }
            mid = (low + high)/2;
            if(nums[mid] >= nums[low]){
                low = mid;
            }
            else if(nums[mid] <= nums[high]){
                high = mid;
            }
        }
        return nums[mid];
    }

    public static void main(String[] args) {
        int[] nums = {6,8,9,0,1,4};
        System.out.println(Min(nums));
    }


}
