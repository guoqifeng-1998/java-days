package com.qfguo.study.day16;

/**
 * @ClassName Test
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/4
 **/
public class Test {
    public static void main(String[] args) {
        String gqf = "湖人总冠军";
        System.out.println(StringUtil.repeat(gqf ,3));
        System.out.println(StringUtil.left(gqf ,2));
        System.out.println(StringUtil.subStringOmit(gqf ,2));
        System.out.println(StringUtil.isEmpty("湖人"));
    }
}
