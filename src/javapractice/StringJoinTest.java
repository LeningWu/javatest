package javapractice;

public class StringJoinTest {
    public static void main(String[] args){
        String s1="crazyjava";
        //s2引用的字符串可以在编译时就确定下来
        //因此s2直接引用常量池中已有的"crazy Java"字符串
        String s2="crazy"+"java";
        System.out.println(s1==s2);
        //定义两个字符串直接量
      //  String str1="crazy";
      //  String str2="java";
        final String str1="crazy";
        final String str2="java";
        String s3=str1+str2;
        System.out.println(s1==s3);
    }
}