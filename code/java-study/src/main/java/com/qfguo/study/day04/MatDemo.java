package com.qfguo.study.day04;

/**
 * @ClassName MatDemo
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/23
 **/
public class MatDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("====================");
        //向上取证
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println("====================");
        //向下取整，抹零
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));
        System.out.println("====================");
        //四舍五入
        System.out.println(Math.round(28.4));
        System.out.println(Math.round(18.5));
        //计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少？
        //符合要求的数量
        int count = 0;
        double min = -10.8;
        double max =5.9;
        // 这样处理，变量i就是区间之间所有的整数
        for (int i = (int) min; i<max; i++ ){
            int abs = Math.abs(i);
            if (abs>6 || abs<2.1){
                System.out.println(i);
                count++;
    }
    }
        System.out.println("共有"+count + "个");
    }
}
