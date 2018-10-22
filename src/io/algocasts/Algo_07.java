package io.algocasts;

import java.util.HashSet;

/**
 * 单身数字
 *
 * @auther williams
 * @create-time 2018-10-20-下午11:45
 */


public class Algo_07 {
    public int singleNumber(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        int uniqueSum = 0;
        for(int num : nums){
            if(!hashSet.contains(num)){
                uniqueSum += num;
                hashSet.add(num);
            }
            sum += num;
        }
        return 2*uniqueSum-sum;
    }

    public static void main(String[] args) {
        Algo_07 algo = new Algo_07();
        int[] nums = {5,7,5,6,6};
        System.out.println(algo.singleNumber(nums));
    }

}
