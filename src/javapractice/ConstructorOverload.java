package javapractice;

public class ConstructorOverload {
    public String name;
    public int count;
    public ConstructorOverload(){} //无参数的构造器
    //对该构造器返回的对象执行初始化
    public ConstructorOverload(String name,int count)
    {
        this.count=count;
        this.name=name;
    }

    public static void main(String[] args){
        //通过无参数的构造器来创建ConstructorOverload对象
        ConstructorOverload oc1=new ConstructorOverload();
        ////通过有参数的构造器来创建ConstructorOverload对象
        ConstructorOverload oc2=new ConstructorOverload("abcdefg",30000);
        System.out.println("oc1的name:"+oc1.name);
        System.out.println("oc2的name:"+oc2.name);
    }
}

