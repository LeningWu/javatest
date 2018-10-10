package javapractice;

public abstract class SpeedMeter {
    //转速
    private double turnRate;
    public SpeedMeter(){}
    //返回车轮半径的方法定义抽象
    public abstract double getRadius();
    public void setTurnRate(double turnRate){
        this.turnRate=turnRate;
    }
    //计算速度通用方法
    public double getSpeed()
    {
        return Math.PI*2*getRadius()*turnRate;
    }
}
