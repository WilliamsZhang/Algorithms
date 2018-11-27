package io.algocasts;

/**
 * 判断一个数是不是丑数
 *
 * @auther williams
 * @create-time 2018-11-22-下午10:02
 */


public class Algo_40 {
    public static boolean isUgly(int number){
        while(number%2 == 0){
            number /= 2;
        }
        while(number%3 == 0){
            number /= 3;
        }
        while(number%5 == 0){
            number /= 5;
        }
        return number == 1;
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println(isUgly(number));
    }
}
