package javapractice;

public class MultiExceptionTest {
    public static void main(String[] args){
        try {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println("the divide result number is:"+c);
        }

        catch (IndexOutOfBoundsException|NumberFormatException|ArithmeticException ie){
            System.out.println("发生了数组越界，数字格式异常，数组异常之一");
            //捕获多异常时，异常默认变量有final修饰
            //下面的错误
            // ie=new ArithmeticException("test");
        }

        catch (Exception e){
            System.out.println("other error");
            //捕获一种类型的异常时，异常变量没有final修饰
            //下面的正确
            e=new RuntimeException("test");
        }
    }
}
