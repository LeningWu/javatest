package javapractice;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
    public static void main(String[] args){
        List fixedList= Arrays.asList("疯狂Java讲义","轻量级Java企业应用实战");
        //获取fixedlist的实现类，将输出ArraysArrayList
        System.out.println(fixedList.getClass());
        //使用方法引用遍历集合元素
        fixedList.forEach(System.out::println);
        //试图增加删除元素都会引起错误
        fixedList.add("疯狂Android讲义");
        fixedList.remove("疯狂Java讲义");
    }
}
