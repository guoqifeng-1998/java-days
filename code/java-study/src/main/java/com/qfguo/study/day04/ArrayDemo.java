package com.qfguo.study.day04;

import java.util.Arrays;

/**
 * @ClassName ArrayDemo
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/23
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        //将int[]数组按照默认格式变成字符串
     int[] intArray={10 ,20 , 30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        //对整形数组排序
        int[] array1 = {2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
     //对字符串数组排序
        String[] array2 = {"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        //将一个随机字符串中的所有字符升序排列,并倒叙打印
        String str = "asv76agfqwdfvasdfvjh";
        //如何进行升序排列：sort
        //必须是一个数组才能进行Arrays sort 方法
        // string--> 数组用toCharArry
        char[] chars = str.toCharArray();
        //对字符属猪进行升序排列
        Arrays.sort(chars);
        //倒叙遍历
        for (int i = chars.length-1;i>=0; i--){
            System.out.println(chars[i]+"");
        }
    }
}
