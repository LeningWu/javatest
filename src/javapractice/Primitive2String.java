package javapractice;

public class Primitive2String {
    public static void main(String[] args) {
        String intStr="123";
        //把一个特定字符串转换成整形
        int it1=Integer.parseInt(intStr);
        int it2=new Integer(intStr);
        System.out.println(it2);
        String floatStr="4.56";
        //字符串转float
        float ft1=Float.parseFloat(floatStr);
        float ft2=new Float(floatStr);
        System.out.println(ft2);
        //把float转String
        String ftStr=String.valueOf(2.345f);
        System.out.println(ftStr);
        //double转String
        String dbStr=String.valueOf(3.344);
        System.out.println(dbStr);
        //把boolean转String
        String boolStr=String.valueOf(true);
        System.out.println(boolStr);

    }
}
