package io.algocasts;

import java.util.Stack;

/**
 * 包含min函数的栈
 *
 * @auther williams
 * @create-time 2018-11-11-下午2:02
 */


public class Algo_14 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public void push(int x){
        stack.push(x);
        if(min.isEmpty() || x<getMin()){
            min.push(x);
        }
    }

    //栈的peek()方法：查看栈顶元素而不移除它

    public int getMin(){
        return min.peek();
    }

    public int getTop(){
        return stack.peek();
    }

    public void pop(){
        if(getTop() == getMin()){
            min.pop();
        }
        stack.pop();
    }

    public static void main(String[] args) {
        Algo_14 algo = new Algo_14();
        algo.push(3);
        algo.push(4);
        algo.push(2);
        algo.push(1);
        System.out.println(algo.getMin());
        algo.pop();
        System.out.println(algo.getMin());
        algo.pop();
        System.out.println(algo.getMin());
        algo.pop();
        System.out.println(algo.getMin());
    }


}
