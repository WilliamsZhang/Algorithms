package io.algocasts;

/**
 * 回文字符串判断
 * 忽略大小写，把除字母和数字的其他字符（包括空格）都跳过
 *
 * @auther williams
 * @create-time 2018-10-14-下午2:33
 */


public class Algo_00 {

    //用于判断是否为数字或字母

    private boolean isAlphanumericOrNumber(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')) {
            return true;
        }
        return false;
    }

    //判断两个字符忽略掉大小写后是否相等,如何比较呢？即如果都是字母把他们全部转换为小写进行比较

    private boolean isEqualIgnoreCapitalization(char a,char b){
        if(a>='A' && a<='Z') {
            a+=32;
        }
        if(b>='A' && b<='Z') {
            b+=32;
        }
        return a==b;
    }

    //定义两个游标，判断是否相等

    public boolean isPalindrome(String s){
        if(s==null || s.length()==0) {
            return true;
        }

        int i=0,j=s.length()-1;
        for(i=0;i<j;i++,j--) {
            while (i < j && !isAlphanumericOrNumber(s.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphanumericOrNumber(s.charAt(j))) {
                j--;
            }
            if (!isEqualIgnoreCapitalization(s.charAt(i), s.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Algo_00 algo = new Algo_00();
        String s ="race s E--car";
        System.out.println(algo.isPalindrome(s));
    }

}
