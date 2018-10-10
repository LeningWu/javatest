package javapractice;

public class FinalLocalVariableTest {
    public void test(final int a){
        //不能对final修饰的形参赋值
        //a=5;非法
    }

    public static void main(String [] args){
        //定义final局部变量时指定默认值,则str变量无法重新赋值
        final String str="hello";
        //str="java";非法
        //定义final局部变量时没有指定默认值,则d变量可被赋值一次
        final double d;
        d=5.6;
        //对final变量重复赋值，d=3.4;非法
    }
}
