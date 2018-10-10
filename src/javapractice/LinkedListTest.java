package javapractice;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList books=new LinkedList();
        //将字符串元素加入队列的尾部
        books.offer("疯狂Java讲义");
        //加入栈的顶部
        books.push("轻量级java");
        //加到队列的头部，相当于栈的顶部
        books.offerFirst("疯狂Android讲义");
        //用List方式遍历集合元素
        for (int i=0;i<books.size();i++){
            System.out.println("遍历中:"+books.get(i));
        }
        //访问但不删除栈顶元素
        System.out.println(books.peekFirst());
        //访问但不删除队列的最后一个元素
        System.out.println(books.peekLast());
        //将栈顶的元素弹出"栈
        System.out.println(books.pop());
        System.out.println(books);
        //删除队列最后一个元素
        System.out.println(books.pollLast());
        System.out.println(books);

    }
}
