package javapractice;

import java.util.HashSet;

//类A的equal方法总返回TRUE，但没有重写hashCode方法
class A{
    public boolean equals(Object obj){
        return true;
    }
}

//类B的hashCpde方法总返回1，但没有重写equals()方法
class B{
    public int hashCode(){
        return 1;
    }
}

//类c的hashCode方法总返回2，且重写equals()方法总是返回true
class C{
    public int hashCode(){
        return 2;
    }

    public boolean equals(Object obj) {
        return true;
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        //分别向books集合中添加两个A对象，两个B对象，两个C对象
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
