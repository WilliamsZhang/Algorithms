package io.algocasts;

/**
 * leetcode 461:汉明距离
 *
 * For Example:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * 汉明距离为2
 *
 * @auther williams
 * @create-time 2018-11-20-下午3:01
 */


public class Algo_29 {
    public static int numberOfOne(int n){
        int count = 0;
        while(n!=0){
            count++;
            n &= n-1;
        }
        return count;
    }

    public static int hammingDistance(int x,int y){
        return numberOfOne(x^y);
    }

    public static void main(String[] args) {
        int x = 1,y = 4;
        System.out.println(hammingDistance(x,y));
    }
}
