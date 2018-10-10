package javapractice;

public class EnumTest {
    public void judge(SeasonEnum s)
    {
        //switch语句里的表达式可以是枚举值
        switch (s)
        {
            case SPRING:
                System.out.println("this is spring");
                break;
            case SUMMER:
                System.out.println("this is summer");
                break;
            case FALL:
                System.out.println("this is fall");
                break;
            case WINTER:
                System.out.println("this is winter");
                break;
        }
    }

    public static void main(String[] args){
        //枚举类默认有方法，返回枚举类的所有实例
        for (SeasonEnum s:SeasonEnum.values())
        {
            System.out.println(s);
        }
        //使用枚举类时可以EnumClass.variable来访问
        new EnumTest().judge(SeasonEnum.SPRING);
    }
}
