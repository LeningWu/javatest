package javapractice;

interface product{
    public double getPrice();
    public String getName();
}
public class AnonymousTest {
    public void test(product p)
    {
        System.out.println("购买了一个"+p.getName()+",花掉了"+p.getPrice());
    }
    public static void main(String [] args){
        AnonymousTest ta=new AnonymousTest();
        //调用Test方法时，需要传入一个product参数
        //此处传入其匿名实现类的实例
        ta.test(new product() {
            @Override
            public double getPrice() {
                return 567.8;
            }

            @Override
            public String getName() {
                return "AGP显卡";
            }
        });
    }
}
