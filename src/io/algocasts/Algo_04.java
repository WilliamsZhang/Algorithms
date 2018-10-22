package io.algocasts;

/**
 * 回文数字判断
 *
 * @auther williams
 * @create-time 2018-10-17-下午2:09
 */


public class Algo_04 {

    public boolean isPalindromeString(int x){
        String s = String.valueOf(x);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 1368631;
        Algo_04 algo = new Algo_04();
        System.out.println(algo.isPalindromeString(x));
    }
}
