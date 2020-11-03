package com.qfguo.study.day13;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName TestCalender
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/3
 **/
public class TestCalender {
    public static void main(String[] args) {
        //创建calender对象
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年" + month +"月" +dayOfMonth+"日");

        Calendar calendar1 =Calendar.getInstance();
        calendar1.set(Calendar.YEAR,2020);
        System.out.println(year+"年" + month +"月" +dayOfMonth+"日");

        Calendar calendar2 = Calendar.getInstance();
        System.out.println(year+"年" + month +"月" +dayOfMonth+"日");

        calendar2.add(Calendar.DAY_OF_MONTH,2);

        calendar2.add(Calendar.YEAR,-3);
        System.out.println(year+"年" + month +"月" +dayOfMonth+"日");

        Calendar calendar3 = Calendar.getInstance();
        Date date = calendar3.getTime();
        System.out.println(date);
    }
}
