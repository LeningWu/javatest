package javapractice;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysTest2 {
    public static void main(String[] args){
        int[] arr1=new int[]{3,-4,25,16,30,18};
        //对数组arr1进行并发排序
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2=new int[]{3,-4,25,16,30,18};
        Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            @Override
            //left代表数组中前一个索引处的元素，计算第一个元素时left为1
            //right代表数组中当前索引处的元素
            public int applyAsInt(int left, int right) {
                return left*right;
            }
        });
        System.out.println(Arrays.toString(arr2));
        int[] arr3=new int[5];
        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            @Override
            //operand代表正在计算的索引
            public int applyAsInt(int operand) {
                return operand*5;
            }
        });
        System.out.println(Arrays.toString(arr3));

    }
}

