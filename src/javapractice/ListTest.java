package javapractice;


import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args){
        List books=new ArrayList();
        books.add(new String("轻量级Java企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Android讲义"));
        System.out.println(books);
        //将新字符串对象插入第二个位置
        books.add(1,new String("疯狂ajax讲义"));
        for (int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }
        //删除第三个元素
        books.remove(2);
        System.out.println(books);
        //判断指定元素在list集合中的位置；输出1，表明位于第二位
        System.out.println(books.indexOf(new String("疯狂ajax讲义")));
        //将第二个元素替换成新的字符串对象
        books.set(1,new String("疯狂Java讲义"));
        System.out.println(books);
        //将books集合的第二个元素到第三个元素截取成子集和
        System.out.println(books.subList(1,2));

    }
}
