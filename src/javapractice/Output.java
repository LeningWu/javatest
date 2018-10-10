package javapractice;

public interface Output
{
    //接口里定义的成员变量只能是常量
    int MAX_CACHE_LINE=50;
    void out();
    void getData(String 轻量级JavaEE企业应用实战);
    //在接口中定义默认方法，用default
    default void print(String... msgs)
    {
        for (String msg:msgs)
        {
            System.out.println(msg);
        }
    }

    default void test()
    {

        System.out.println("默认的test方法");
    }

    static String staticTest()
    {
        return "接口里的类方法";
    }
}
