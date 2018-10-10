package javapractice;

import java.util.ArrayList;
import java.util.Collections;

public class SearchTest {
    public static void main(String[] args){
        ArrayList nums=new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        Collections.replaceAll(nums,0,1);//替换
        System.out.println(nums);
        //判断-5在List集合中出现的次数，返回1
        System.out.println(Collections.frequency(nums,-5));
        Collections.sort(nums);
        System.out.println(nums);
        //只有排序后的list集合才可以用二分法查询，输出3
        System.out.println(Collections.binarySearch(nums,3));

    }
}
