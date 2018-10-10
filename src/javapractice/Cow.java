package javapractice;

public class Cow {
    private double weight;
    //外部类的两个重载的构造器
    public Cow(){}
    public Cow(double weight){
        this.weight=weight;
    }
    //定义一个非静态内部类
    private class CowLeg
    {
        private double length;
        private String color;
        public CowLeg(){}
        public CowLeg(double length,String color){
            this.length=length;
            this.color=color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }
        //非静态内部类的实例方法
        public void info(){
            System.out.println("the color is:"+color+" length:"+length);
            //直接访问外部类的private修饰的成员变量
            System.out.println("the weight:"+weight);
        }
    }
    public void test(){
        CowLeg c1=new CowLeg(1.12,"black");
        c1.info();
    }

    public static void main(String[] args){
        Cow cow=new Cow(378.2);
        cow.test();
    }
}
