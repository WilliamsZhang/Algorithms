package io.algocasts;

import java.util.Stack;

/**
 * 剑指offer 面试题9 : 用两个栈实现队列
 * @auther williams
 * @create-time 2018-11-18-下午4:05
 */


public class Algo_22 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
    }

    public int remove(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Algo_22 algo = new Algo_22();
        algo.push(1);
        algo.push(2);
        algo.push(3);
        System.out.println(algo.remove());
        System.out.println(algo.remove());
        System.out.println(algo.remove());
    }
}
