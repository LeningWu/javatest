package javapractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondTest {
    public static void main(String[] args){
        List<String>books=new ArrayList<>();
        books.add("疯狂java");
        books.add("疯狂android");
        //遍历books
        books.forEach(ele-> System.out.println(ele));
        //Java自动推断出Hashmap的<>里就是STring和List《String》类型
        Map<String,List<String>>schoolsInfo=new HashMap<>();
        //java自动推断出ArrayList里应该是String
        List<String>schools=new ArrayList<>();
        schools.add("斜月三星洞");
        schools.add("西天取经路");
        schoolsInfo.put("孙悟空",schools);
        schoolsInfo.forEach((key,value)-> System.out.println(key+"--->"+value));
    }
}
