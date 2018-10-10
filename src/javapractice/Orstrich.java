package javapractice;

public class Orstrich extends Bird {
    //重写fly()方法
    public void fly()
    {
        System.out.println("i can run...");
    }
    public static void main(String[] args){
        Orstrich os=new Orstrich();
        os.fly();
    }
}
