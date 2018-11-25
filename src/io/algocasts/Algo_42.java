package io.algocasts;


/**
 * 容纳最多水的凹槽容量
 *
 * @auther williams
 * @create-time 2018-11-25-下午6:12
 */


public class Algo_42 {

    public static int maxWater(int[] height){
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i<j){
            int cur = Math.min(height[i],height[j]) * (j-i);
            if(cur > max){
                max = cur;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {2,7,5,3,9,4};
        System.out.println(maxWater(height));
    }
}
