package javapractice;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args){
        Collection books=new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        //统计书名包含"疯狂"子串的图书数量
        System.out.println(calAll(books,ele->((String)ele).contains("疯狂")));
        System.out.println(calAll(books,ele->((String)ele).contains("Java")));
        System.out.println(calAll(books,ele->((String)ele).length()>10));
    }
    public static int calAll(Collection books, Predicate p){
        int total=0;
        for (Object obj:books){
            //使用Predicate的test()方法判断该对象是否满足Predicate指定条件
            if (p.test(obj)){
                total++;
            }
        }
        return  total;
    }
}
