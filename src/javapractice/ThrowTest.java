package javapractice;

public class ThrowTest {
    public static void main(String[] args){
        try {
            //调用声明抛出Checked异常的方法，要么显示捕获该异常
            //要么在main方法中再次声明
            throwChecked(-3);
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
        throwRuntime(3);
    }

    public static void throwChecked(int a)throws Exception{
        if (a>0){
            throw new Exception("a大于0，不符合要求");

        }
    }

    public static void throwRuntime(int a){
        if (a>0){
            throw new RuntimeException("a>0不符合要求");
        }
    }
}
