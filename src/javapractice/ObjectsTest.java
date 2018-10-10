package javapractice;

import java.util.Objects;

public class ObjectsTest {
    //定义一个obj变量，默认值是null
    static ObjectsTest obj;
    public static void main(String[] args){
        //输出一个null对象的hashcode值，输出0
        System.out.println(Objects.hashCode(obj));
        //输出一个null对象的toString值，输出null
        System.out.println(Objects.toString(obj));
        //要求obj不能为null，如果为则发生异常
        System.out.println(Objects.requireNonNull(obj,"obj参数不能是null"));
    }
}
