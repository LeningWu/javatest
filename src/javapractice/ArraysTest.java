package javapractice;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 5, 6};
        int[] a2 = new int[]{3, 4, 5, 6};
        //a和a2两个数组相等
        System.out.println("a与a2是否相等：" + Arrays.equals(a, a2));
        //判断两个数组是否相等
        int[] b = Arrays.copyOf(a, 6);
        //把a拷贝到b中
        System.out.println("a与b是否相等：" + Arrays.equals(a, b));
        //转换成字符输出
        System.out.println("b的元素:" + Arrays.toString(b));
        Arrays.fill(b, 2, 4, 1);
        //b的2到4位填充成1
        System.out.println("b的元素:" + Arrays.toString(b));
        Arrays.sort(b);
        //给b排序
    }
}
