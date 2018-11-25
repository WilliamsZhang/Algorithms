package io.algocasts;

/**
 * 剑指offer 面试题15:二进制中1的个数
 *
 * @auther williams
 * @create-time 2018-11-20-下午2:57
 */


public class Algo_28 {
    public static int NumberOf1(int n){
        int count = 0;
        while(n != 0){
            count++;
            n &= n-1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(NumberOf1(n));
    }

}
