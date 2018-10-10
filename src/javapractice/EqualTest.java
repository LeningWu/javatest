package javapractice;

public class EqualTest {
    public static void main(String[] args){
        int it=65;
        float f1=65.0f;
        System.out.println("65和65.0f是否相等？"+(it==f1));//true
        char ch='A';
        System.out.println("65和A是否相等？"+(it==ch));//true
        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println("str1和str2是否相等？"+(str1==str2));//false
        System.out.println("str1和str2是否equal? "+(str1.equals(str2)));//true
    }
}
