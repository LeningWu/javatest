package javapractice;

import java.util.*;

public class UnmodifiableTest {
    public static void main(String[] args){
        //创建一个空的，不可改造的List对象
        List unmodifiableList= Collections.emptyList();
        //创建一个只有一个元素，且不可改变的set对象
        Set unmodifiableSet=Collections.singleton("java");
        //创建一个普通的Map对象
        Map scores=new HashMap();
        scores.put("语文",80);
        scores.put("Ios",82);
        //返回普通map对象对应的不可变版本
        Map unmodifiableMap=Collections.unmodifiableMap(scores);
    }
}
