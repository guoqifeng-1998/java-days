package com.qfguo.study.day13;

/**
 * @ClassName TestSystem
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/3
 **/
public class TestSystem {
    private static final  int Max = 10000;

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Long start = System.currentTimeMillis();
        for (int i = 0;i<Max;i++){
            System.out.println(i);
        }
        Long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒：" +(end - start));
    }
}
