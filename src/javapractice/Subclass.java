package javapractice;

class Baseclass{
    public int book=6;
    public void base()
    {
        System.out.println("父类的普通方法");
    }
    public void test()
    {
        System.out.println("父类被覆盖的方法");
    }
}

public class Subclass extends Baseclass{
    //重新定义一个book实例变量隐藏父类的book实例变量
    public String book="轻量级java ee企业实用应战";
    public void test()
    {
        System.out.println("子类的覆盖父类的方法");
    }
    public void sub()
    {
        System.out.println("子类的普通方法");
    }
    public static void main(String[] args)
    {
        //下面编译时类型和运行时一样，不存在多态
        Baseclass bc=new Baseclass();
        //输出6
        System.out.println(bc.book);
        //下面两次调用将执行Baseclass方法
        bc.base();
        bc.test();
        //下面编译时类型和运行时一样，不存在多态
        Subclass sc=new Subclass();
        //输出轻量级java ee企业实用应战
        System.out.println(sc.book);
        //下面调用从父类继承到的base方法
        sc.base();
        //执行当前类的test方法
        sc.test();
        //下面编译时类型和运行时类型不一样，多态发生
        Baseclass ploymophicBc=new Subclass();
        //输出6表明访问的是父类的实例变量
        System.out.println(ploymophicBc.book);
        //执行从父类继承到的base方法v
        ploymophicBc.base();
        //执行从当前类的test方法
        ploymophicBc.test();

    }
}
