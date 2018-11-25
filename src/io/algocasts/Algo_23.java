package io.algocasts;

/**
 * 剑指offer 面试题10:斐波那契数列
 *
 * @auther williams
 * @create-time 2018-11-18-下午7:56
 */


public class Algo_23 {

//    public static long Fibonacci(int n){
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        else{
//            return Fibonacci(n-1)+Fibonacci(n-2);
//        }
//    }

    public static long Fibonacci(int n){
        long fibNMinusOne = 1L;
        long fibNMinusTwo = 0L;
        long fibN = 0;
        for(int i=2;i<=n;i++){
            fibN = fibNMinusOne+fibNMinusTwo;
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }



    public static void main(String[] args) {
        System.out.println(Fibonacci(100));
    }

}
