package javapractice;

public class Outer {
    private int outProp=9;

    class Inner{
        private int inProp=5;
        public void acessOuterProp(){
            //非静态内部类可以直接访问外部类的private成员变量
            System.out.println("外部类的outProp："+outProp);
        }
    }

    public void accessInnerProp(){
        //外部类不能直接访问非静态内部类的实例变量inProp
        //如需访问内部类的实例变量必须显示创建内部类对象
        System.out.println("内部类的inProp:"+new Inner().inProp);
    }

    public static void main(String[] args){
        Outer out=new Outer();
        out.accessInnerProp();
    }
}
