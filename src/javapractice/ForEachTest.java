package javapractice;

public class ForEachTest {
    public static void main(String[] args)
    {
        String[] books={"hello","123","world"};
        //用foreach遍历所有元素,无需数组长度
        //在foreach循环中不能改变数组元素的值
        for (String book:books) {
            System.out.println(book);
        }


    }
}
