package javapractice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
    public static void main(String[] args) {
        //创建集合
        Collection books = new HashSet();
        books.add("1");
        books.add("2");
        books.add("3");
        Iterator it = books.iterator();
        //获取books集合对应的迭代器
        while (it.hasNext()) {
            String book = (String) it.next();
            System.out.println(book);
            if (book.equals("567")) {
                //使用iterator迭代过程中，不可修改集合元素，下面代码引发异常
                books.remove(book);
            }
        }
    }
}
