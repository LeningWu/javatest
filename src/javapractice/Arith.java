package javapractice;

import java.math.BigDecimal;

public class Arith {
    //默认除法运算精度
    private static final int DEF_DIV_SCALE=10;
    //构造器私有，不能实例化
    private Arith(){}
    //精确加法
    public static double add(double v1,double v2){
        BigDecimal b1=BigDecimal.valueOf(v1);
        BigDecimal b2=BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }
    //精确减法
    public static double sub(double v1,double v2){
        BigDecimal b1=BigDecimal.valueOf(v1);
        BigDecimal b2=BigDecimal.valueOf(v2);
        return b1.subtract(b2).doubleValue();
    }
    //精确乘法
    public static double mul(double v1,double v2){
        BigDecimal b1=BigDecimal.valueOf(v1);
        BigDecimal b2=BigDecimal.valueOf(v2);
        return b1.multiply(b2).doubleValue();
    }
    //相对精确除法，除不尽时精确到小数点后十位四舍五入
    public static double div(double v1,double v2){
        BigDecimal b1=BigDecimal.valueOf(v1);
        BigDecimal b2=BigDecimal.valueOf(v2);
        return b1.divide(b2,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static void main(String[] args){
        System.out.println(Arith.add(0.05,0.01));
        System.out.println(Arith.sub(1.0,0.42));
        System.out.println(Arith.mul(4.015,100));
        System.out.println(Arith.div(123.3,100));
    }
}