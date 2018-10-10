package javapractice;

import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args){
        ArrayDeque stack=new ArrayDeque();
        stack.push("疯狂java讲义");
        stack.push("轻量级java企业应用实战");
        stack.push("疯狂Android讲义");
        System.out.println(stack);
        //访问第一个元素，但并不将其出栈
        System.out.println(stack.peek());
        System.out.println(stack);
        //pop出第一个元素
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
