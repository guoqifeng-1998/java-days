package com.qfguo.study.day09;

/**
 * @ClassName Test7
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/10/28
 **/
public class Test7 {
    public static void main(String[] args) {
        //定义两个变量a，b并赋值
        int a = 10;
        int b = 20;
        //控制台输出变量a，b的值
        System.out.println("互换前");
        System.out.println(a);
        System.out.println(b);
        //定义一个第三方变量。不复制
        int temp;
        //利用第三方变量,是a，b的值互换
        temp = a;
        a= b;
        b = temp;
        //控制台输出变量a。b互换后的值
        System.out.println("互换后");
        System.out.println(a);
        System.out.println(b);
    }
}
