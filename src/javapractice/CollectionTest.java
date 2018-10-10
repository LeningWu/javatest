package javapractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args){
        Collection c=new ArrayList();
        //添加元素
        c.add("孙悟空");
        //虽然集合里不能放基本类型的值，但Java支持自动装箱
        c.add(6);
        System.out.println("c集合的元素个数为:"+c.size());//输出2
        //删除指定元素
        c.remove(6);
        System.out.println("c集合的元素个数是："+c.size());//输出1
        //判断是否包含指定字符串
        System.out.println("c集合是否包含\"孙悟空\"字符串："+c.contains("孙悟空"));//true
        c.add("2333");
        System.out.println("c集合的元素"+c);
        Collection books=new HashSet();
        books.add("2333");
        books.add("疯狂java讲义");
        System.out.println("c集合是否完全包含books集合？"+c.containsAll(books));//false
        //用c集合减去books集合里的元素
        c.removeAll(books);
        System.out.println("c集合的元素："+c);
        //删除c集合里的所有元素
        c.clear();
        System.out.println("c集合的元素："+c);
        //控制books集合里只剩下c集合里也包含的元素
        books.retainAll(c);
        System.out.println("books集合里的元素："+books);
    }
}
