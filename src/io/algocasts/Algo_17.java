package io.algocasts;

/**
 * 剑指offer 面试题5:　替换空格
 * @auther williams
 * @create-time 2018-11-13-下午10:15
 */


public class Algo_17 {

    public static String ReplaceBlank(StringBuffer str) {

        if (str == null) {
            return null;
        }

        int originLength = str.length();

        int numberOfBlack = 0;
        for (int i = 0; i < originLength; i++) {
            if (str.charAt(i) == ' ') {
                numberOfBlack++;
            }
        }

        int newLength = originLength + numberOfBlack * 2;
        str.setLength(newLength);

        int indexOfOriginal = originLength - 1;
        int indexOfNew = newLength - 1;

        while (indexOfOriginal >= 0 && indexOfNew != indexOfOriginal) {
            if (str.charAt(indexOfOriginal) == ' ') {
                str.setCharAt(indexOfNew--, '0');
                str.setCharAt(indexOfNew--, '2');
                str.setCharAt(indexOfNew--, '%');
                indexOfOriginal--;
            } else {
                str.setCharAt(indexOfNew--, str.charAt(indexOfOriginal--));
            }

        }

        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("we are happy");
        System.out.println(ReplaceBlank(str));
    }
}













