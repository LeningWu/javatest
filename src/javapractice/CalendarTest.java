package javapractice;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args){
        Calendar c=Calendar.getInstance();
        //取出年
        System.out.println(c.get(Calendar.YEAR));
        //月
        System.out.println(c.get(Calendar.MONTH));
        //日
        System.out.println(c.get(Calendar.DATE));
        //分别设置年月日小时分钟秒
        c.set(2003,10,23,12,32,23);
        System.out.println(c.getTime());
        //将calendar的年向前推一年
        c.add(Calendar.YEAR,-1);
        System.out.println(c.getTime());
        //月推8个月
        c.roll(Calendar.MONTH,-8);
        System.out.println(c.getTime());
    }
}
