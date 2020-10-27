package com.qfguo.study.day08;

/**
 * @ClassName Test4
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/10/27
 **/
public class Test4 {
    public static void main(String[] args) {
        //定义两个byte类型变量，分别福byte类型范围最大值和最小值，并输出在控制台
        byte num1 = -128;
        byte num2 = -127;
        System.out.println(num1);
        System.out.println(num2);
        //定义连个short类型变量，分别以short类型范围内的值，并输出在控制台
        short num3 = -21758;
        short num4 = 32757;
        System.out.println(num3);
        System.out.println(num4);
        //定义两个int类型变量，分别赋于int 类范围内的值，并输出在控制台
        int num5 = -21474654;
        int num6 = 214346743;
        System.out.println(num5);
        System.out.println(num6);
        //定义两个long类型变量，分别赋予超过int类型范围的值，并输出在控制台
        long num7 = -224545746L;
        long num8 = 21546434L;
        System.out.println(num7);
        System.out.println(num8);
    }
}
