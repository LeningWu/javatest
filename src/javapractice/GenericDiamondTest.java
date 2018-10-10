package javapractice;

class MyClass<E>{
    public <T> MyClass(T t)
    {
        System.out.println("t参数的值:"+t);
    }
}

public class GenericDiamondTest {
    public static void main(String[] args){
        //MyClass类声明中的E形参是String类型
        //泛型构造器中声明的T形参是Integer类型
        MyClass<String>mc1=new MyClass<>(5);
        MyClass<String>mc2=new <Integer>MyClass<String>(5);

    }
}
