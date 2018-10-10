package javapractice;

public class TwoDimensionTest {
    public static void main(String[] args){
        int[][] a;
        a=new int[4][];
        //把a当成一维数组初始化，初始化a是长度为4数组
        //a数组数组元素又是引用类型
        //把a当一位遍历
        for (int i = 0,len=a.length; i < len; i++) {
            System.out.println(a[i]);
        }
        a[0]=new int[2];
        a[0][1]=6;
        for (int i = 0,len=a[0].length; i <len ; i++) {
            System.out.println(a[0][i]);
        }

    }
}
