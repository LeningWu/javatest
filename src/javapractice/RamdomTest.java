package javapractice;

import java.util.Arrays;
import java.util.Random;

public class RamdomTest {
    public static void main(String[] args){
        Random rand=new Random();
        System.out.println("rand,nextBoolen()"+rand.nextBoolean());
        byte[] buffer=new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        //生成0.0~0.1之间的伪随机double数
        System.out.println("rand.nextDouble()"+rand.nextDouble());
        //生成0.0~0.1之间的伪随机float数
        System.out.println("rand.nextFloat()"+rand.nextFloat());
        //生成平均值是0.0，标准差是1.0的伪高斯数
        System.out.println("rand.nextGaussian()"+rand.nextGaussian());
        //生成一个处于int整数曲子范围的伪随机数
        System.out.println("rand.nextInt()"+rand.nextInt());
        //生成0~26之间的伪随机数
        System.out.println("rand.nextInt(26)"+rand.nextInt(26));

    }
}
