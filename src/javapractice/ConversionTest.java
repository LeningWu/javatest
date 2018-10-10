package javapractice;

public class ConversionTest {
    public static void main(String[] args)
    {
        double d=13.5;
        long l=(long)d;
        System.out.println(l);
        int in=5;
        //boolean b=(boolean)in
        Object obj="hello";
        String objStr=(String)obj;
        System.out.println(objStr);
        Object objpri=new Integer(5);
        if (objpri instanceof String) {
            String str = (String) objpri;
        }
    }
}
