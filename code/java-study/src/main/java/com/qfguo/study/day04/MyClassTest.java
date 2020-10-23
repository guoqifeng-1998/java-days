package com.qfguo.study.day04;

/**
 * @ClassName MyClassTest
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/23
 **/

import java.security.PublicKey;

/**
 * 一旦使用static修饰成员方法,那么这就成为了静态方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
 * 如果有了static关键字，那么不需要创建对象直接节能通过类名来使用他
 * 无论成员变量，还是成员方法，如果有了static，都推荐使用类名称进行调用
 * 静态变量：类名称，静态变量
 * 静态方法：类名称，静态方法（）
 *注意事项：
 * 1，静态不能直接访问非静态
 * 原因、因为在内存中是先有的静态内容，后有的非静态内容
 * 2，静态方法当中不能用this
 * 原因：this代表当前对象，通过调用的方法，是就是当前对象
 */
public class MyClassTest {
    public static void main(String[] args) {
        //首相创建对象
 MyClass obj = new MyClass();

obj.method();
 MyClass.methodStatic();
 myMethod();
 MyClassTest.myMethod();}
            public static  void  myMethod(){
                System.out.println("自己d的的方法");
            }
        }

