package javapractice;

import java.util.Arrays;

class person{
    private int age;
    public person(){}
    public person(int age){
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class FinalReferenceTest {
    public static void main(String[] args){
        //final修饰数组变量,iArr是一个引用变量
        final int[] iArr={5,6,2,19};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2]=-8;
        System.out.println(Arrays.toString(iArr));
        //iArr=null非法，因为对iArr重新赋值,非法
        //final修饰person变量，p是一个引用变量
        final person p=new person(45);
        //改变person对象的age实例变量，合法
        p.setAge(23);
        System.out.println(p.getAge());
        //p=null非法，因为对p重新赋值了
    }
}
