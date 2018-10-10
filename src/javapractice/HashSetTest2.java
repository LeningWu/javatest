package javapractice;

import java.util.HashSet;
import java.util.Iterator;

class R{
    int count;
    public R(int count){
        this.count=count;
    }

    @Override
    public String toString() {
        return "R[count:"+count+"]";
    }

    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj!=null&&obj.getClass()==R.class){
            R r=(R)obj;
            return this.count==r.count;
        }
        return false;
    }
    public int hashCode(){
        return this.count;
    }
}

public class HashSetTest2 {
    public static void main(String[] args){
        HashSet hs=new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        //打印HashSet集合，集合元素没有重复
        System.out.println(hs);
        //取第一个元素
        Iterator it=hs.iterator();
        R first=(R)it.next();
        //为第一个元素的count实例变量赋值
        first.count=-3;
        //再次输出HashSet集合，集合元素有重复元素
        System.out.println(hs);
        //删除count为-3的R对象
        hs.remove(new R(-3));
        System.out.println(hs);
        System.out.println("hs是否包含count为-3的R对象"+hs.contains(new R(-3)));
        System.out.println("hs是否包含count为-2的R对象"+hs.contains(new R(-2)));
    }
}
