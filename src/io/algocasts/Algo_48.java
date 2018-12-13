package io.algocasts;

import java.util.Arrays;

/**
 * 合并两个有序数组
 *
 * @auther williams
 * @create-time 2018-11-27-下午11:19
 */


public class Algo_48 {
    public static int[] mergeTwoSortedArray(int[] nums1,int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        int[] nums = new int[k+1];

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(j>=0){
            nums[k] = nums2[j];
            k--;
            j--;
        }
        while(i>=0){
            nums[k] = nums1[i];
            k--;
            i--;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,3};
        int[] nums = mergeTwoSortedArray(nums1,nums2);
        System.out.println(Arrays.toString(nums));

    }

}
