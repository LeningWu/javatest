package javapractice;

public class ThisInConstructor {
    public int foo;
    public ThisInConstructor(){
        //在构造器里定义一个foo变量
        int foo=0;
        //this代表该构造器正在初始化的对象
        this.foo=6;
    }

    public static void main(String[] args){
        System.out.println(new ThisInConstructor().foo);
    }

}