package com.qfguo.study.day04;

/**
 * @ClassName MyClass
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/23
 **/
public class MyClass {
/**
 * 成员变量
 */
int num;
/**
 * 静态变量
 */
static int numStatic;
/**
 * 成员方法
 */
public void method(){
    System.out.println("这是一个成员方法");
    //成员方法可以访问成员变量
    System.out.println(num);
    //成员方法可以访问静态变量
    System.out.println(numStatic);
}
/**
 * 静态方法
 */
public static void methodStatic() {
    System.out.println("这是一个静态方法");
    System.out.println(numStatic);
}
}
