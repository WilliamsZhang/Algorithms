package io.algocasts;

import java.util.HashMap;

/**
 * 求数组中个数最多的数字
 *
 * @auther williams
 * @create-time 2018-10-22-下午4:25
 */


public class Algo_10 {

    public int getMajorityWithHashMap(int[] nums){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int maxNum=0;
        int maxCount=0;
        for(int num : nums){
            int newCount = hashMap.getOrDefault(num,0)+1;
            hashMap.put(num,newCount);
            if(newCount>maxCount){
                maxCount=newCount;
                maxNum=num;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Algo_10 algo = new Algo_10();
        int[] nums = {1,3,5,1,3,3};
        System.out.println(algo.getMajorityWithHashMap(nums));
    }

}
