package javapractice;

public class Apple {
    public String name;
    public String color;
    public double weight;
    public Apple(){} //无参数构造器
    //两个参数的构造器
    public Apple(String name,String color){
        this.name=name;
        this.color=color;
    }
    public Apple(String name,String color,double weight){
        //通过this调用前一个重载的构造器的初始化代码
        this(name,color);
        //该构造器引用
        this.weight=weight;
    }

}
