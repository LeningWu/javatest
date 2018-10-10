package javapractice;

public class FinalVariableTest {
    //定义成员变量时指定默认值，合法
    final int a=6;
    //下面的变量将在构造器或初始化块中分配初始值
    final String str;
    final int c;
    final static double d;
    //初始化块，可对没有指定默认值的实例变量指定初始值
    {
        //在初始化快中为实例变量指定初始值合法
        str="hello";
    }

    //静态初始化块，可对没有指定默认值的类变量指定初始值
    static {
        d=5.6;
    }

    //构造器可对既没有默认指定值有没有在初始化块中的实例变量指定初始值
    public FinalVariableTest(){
        c=5;
    }

    public static void main(String[] args){
        FinalVariableTest ft=new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(ft.str);
    }
}
