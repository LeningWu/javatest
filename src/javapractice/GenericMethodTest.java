package javapractice;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
    //声明一个泛型方法，带一个T形参有网么，视频一下？[Smirk]
    static <T> void fromArrayToCollection(T[] a, Collection<T> c){
        for (T o:a){
            c.add(o);
        }
    }
    public static void main(String[] args){
        Object[] oa=new Object[100];
        Collection<Object> co=new ArrayList<>();
        //下面的T代表object类型
        fromArrayToCollection(oa,co);
        String[] sa=new String[100];
        Collection<String>cs=new ArrayList<>();
        //下面的T代表string类型
        fromArrayToCollection(sa,cs);
        //下面的T代表object类型
        fromArrayToCollection(sa,co);
        Integer[] ia=new Integer[100];
        Float[] fa=new Float[100];
        Number[] na=new Number[100];
        Collection<Number> cn=new ArrayList<>();
        //下面的T代表number类型
        fromArrayToCollection(ia,cn);
        //下面的T代表number类型
        fromArrayToCollection(fa,cn);
        //下面的T代表number类型
        fromArrayToCollection(na,cn);
        //下面的T代表object类型
        fromArrayToCollection(na,co);
        ////下面的T代表string类型,但na是一个number数组
        //因为number不是String类型，也不是他的子类，所以编译错误
        //fromArrayToCollection(na,cs);
    }
}
