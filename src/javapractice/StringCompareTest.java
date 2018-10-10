package javapractice;

public class StringCompareTest {
    public static void main(String[] args){
        //s1直接引用常量池中的"crazy java"
        String s1="crazy java";
        String s2="crazy";
        String s3="java";
        //s4后面的字符串可以在编译时就确定下来
        //s4直接引用常量池中的"crazy Java"
        String s4="crazy"+"java";
        //s5后面的字符串可以在编译时就确定下来
        //s5直接引用常量池中的"crazy Java"
        String s5="cra"+"zy"+"java";
        //s6后面的字符串不能在编译时就确定下来
        //不能引用常量池中的字符串
        String s6=s2+s3;
        //use new creat a new String
        //a7引用内存堆中新创建的String对象
        String s7=new String("crazy java");
        System.out.println(s1==s4);//true
        System.out.println(s1==s5);//true
        System.out.println(s1==s6);//false
        System.out.println(s1==s7);//false
    }
}
