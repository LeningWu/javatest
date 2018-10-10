package javapractice;

import java.util.TreeMap;

class R2 implements Comparable{
    int count;
    public R2(int count){
        this.count=count;
    }
    public  String toString(){
        return "R2[count:"+count+"]";
    }

    //根据count来判断两个对象是否相等
    public boolean equals(Object obj){
        if (this==obj)
            return true;
        if (obj!=null && obj.getClass()==R2.class){
            R2 r=(R2)obj;
            return r.count==this.count;
        }
        return false;
    }
//根据count属性值来判断两个对象的大小

    @Override
    public int compareTo(Object obj) {
        R2 r=(R2)obj;
        return count>r.count?1:count<r.count?-1:0;
    }
}

public class TreeMapTest {
    public static void main(String[] args){
        TreeMap tm=new TreeMap();
        tm.put(new R2(3),"java 企业");
        tm.put(new R2(-5),"疯狂java讲义");
        tm.put(new R2(9),"androad");
        System.out.println(tm);
        //返回该treemap的第一entry对象
        System.out.println(tm.firstEntry());
        //返回treemap的最后一个key
        System.out.println(tm.lastKey());
        //返回该treemap大的new R(2)大的最小key值
        System.out.println(tm.higherKey(new R2(2)));
        //返回该treemapnew R(2)小的最大key-value对
        System.out.println(tm.lowerEntry(new R2(2)));
        //返回该Treemap的子TreeMap
        System.out.println(tm.subMap(new R2(-1),new R2(4)));
    }
}