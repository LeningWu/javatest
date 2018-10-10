package javapractice;

public class Apple2<T> {
    //使用T类型形参定义实例变量
    private T info;
    public Apple2(){}
    //下面方法中使用T类型形参定义构造器
    public Apple2(T info){
        this.info=info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return this.info;
    }

    public static void main(String[] args){
        //由于传给T形参是String，所以构造器参数只能是String
        Apple2<String>a1=new Apple2<>("apple");
        //由于传给T形参是double，所以构造器参数只能是double
        Apple2<Double>a2=new Apple2<>(5.67);
        System.out.println(a2.getInfo());
    }
}
