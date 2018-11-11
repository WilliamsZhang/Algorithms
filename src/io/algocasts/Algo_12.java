package io.algocasts;

/**
 * 二分搜索
 * @auther williams
 * @create-time 2018-10-23-上午9:55
 */


public class Algo_12 {

    public int binarySearch(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;


        while(low<=high) {
            int mid = (low+high)/2;
            if (nums[mid] < target) {
                low = mid + 1;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Algo_12 algo = new Algo_12();
        int[] nums = {-2,0,2,4,5,8,9};
        int target = 5;
        System.out.println(algo.binarySearch(nums,target));
    }

}
