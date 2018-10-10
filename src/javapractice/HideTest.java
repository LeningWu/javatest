package javapractice;

class Parent{
    public String tag="疯狂java讲义";
}

class Derived extends Parent{
    //定义一个私有的tag来隐藏父类的tag
    private String tag="轻量级Java实战";
}

public class HideTest {
    public static void main(String[] args)
    {
        Derived d=new Derived();
        //不可访问私有的tag
        //System.out.println(d.tag)错误
        //将d显示地向上转型为Parent就可以访问tag实例变量
        System.out.println(((Parent)d).tag);
    }
}
