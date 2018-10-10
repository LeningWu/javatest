package javapractice;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        Map map=new HashMap();
        //放入多个map对
        map.put("疯狂Java讲义",109);
        map.put("疯狂iOS讲义",10);
        map.put("疯狂Ajix讲义",79);
        map.put("轻量级java企业应用实战",99);
        //放重复的key时，新的value会覆盖原有的value
        //如果新的value覆盖了原有的value，该方法返回被覆盖的value
        System.out.println(map.put("疯狂iOS讲义",99));
        System.out.println(map);
        //判断是否包含指定key
        System.out.println(map.containsKey("疯狂iOS讲义"));
        //判断是否包含指定的value
        System.out.println(map.containsValue(99));
        //获取Map集合所有key组成的集合，通过遍历key来实现所有的对
        for (Object key:map.keySet()){
            //map.get(key)方法获得指定key的value
            System.out.println(key+"-->"+map.get(key));
        }
        map.remove("疯狂Ajix讲义");
        System.out.println(map);
    }
}
