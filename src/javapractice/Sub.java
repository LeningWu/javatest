package javapractice;

class Base{
    public double size;
    public String name;
    public Base(double size, String name)
    {
        this.size= this.size;
        this.name= this.name;
    }
}

public class Sub extends Base {
    public String color;
    public Sub(double size,String name,String color)
    {
        //用super调用来调用父类构造器的初始化过程
        super(size,name);
        this.color=color;
    }

    public static void main(String[] args)
    {
        Sub s=new Sub(5.6,"测试对象","red");
        System.out.println(s.size + "--" + s.name + "--" + s.color);
    }

}
