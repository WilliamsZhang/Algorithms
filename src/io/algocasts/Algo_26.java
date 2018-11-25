package io.algocasts;

/**
 * 数值的整数次方
 * 位运算符参见 : https://blog.csdn.net/xiaochunyong/article/details/7748713
 *
 * @auther williams
 * @create-time 2018-11-19-下午9:54
 */


public class Algo_26 {
    public static double pow(double x,int n){
        double result = 1;
        int N = Math.abs(n);
        for (int i = 0; i < N; i++) {
            result *= x;
        }
        return n < 0 ? 1/result : result;
    }

    public static double powFast(double x,int n){
        double result = 1;
        int N = Math.abs(n);
        while(N!=0){
            if((N & 1) == 1){
                result *= x;
            }
            x *= x;
            N >>= 1;
        }
        return n < 0 ? 1/result : result;
    }

    public static void main(String[] args) {
        System.out.println(pow(2,-5));
        System.out.println(powFast(2,-5));
    }
}
