package javapractice;

class apple{
    private String color;
    private double weight;
    public apple(){}
    //有参数的构造器
    public apple(String color,double weight){
        this.color=color;
        this.weight=weight;
    }

    public String toString()
    {
        return "one apple,the color is:"+color+",the weight is:"+weight;
    }
}
public class ToStringTest {
    public static void main(String[] args)
    {
        apple a=new apple("red",5.68);
        System.out.println(a);
    }
}
