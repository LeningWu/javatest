package javapractice;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args){
        Map map=new HashMap();
        map.put("java",109);
        map.put("ios",99);
        map.put("ajax",79);
        //尝试替换xml,但原来的map中没有对应的value，所以不会添加新的对
        map.replace("xml",66);
        System.out.println(map);
        //使用元value与传入参数计算出来的结果覆盖原有的value
        map.merge("ios",10,(oldVal,param)->(Integer)oldVal+(Integer)param);
        System.out.println(map);//ios的value扩大了10
        //当key为java对应的value为null，用计算的新结果作为新的value
        map.computeIfAbsent("java",(key)->((String)key).length());
        System.out.println(map);//java=4
        map.computeIfPresent("java",(key,value)->(Integer)value*(Integer)value);
        System.out.println(map);//java=4变成java=6
    }
}