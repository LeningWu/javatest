package javapractice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args){
        //创建集合
        Collection books=new HashSet();
        books.add("1");
        books.add("2");
        books.add("3");
        Iterator it=books.iterator();
        while (it.hasNext()){
            //it.next方法返回的数据类型是Object类型，因此需要强制类型转换
            String book=(String)it.next();
            System.out.println(book);
            if (book.equals("2")){
                //从集合中删除上一次Next方法返回的元素
                it.remove();
            }
            //book变量赋值，不会改变集合元素本身
            book="test string";
        }
        System.out.println(books);
    }
}
