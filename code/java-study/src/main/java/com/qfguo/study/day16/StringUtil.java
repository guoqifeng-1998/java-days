package com.qfguo.study.day16;

import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StringUtil
 * @Description 字符串操作
 * @Author gqfeng
 * @Date 2020/11/4
 **/
public class StringUtil {
    /**
     * 判断是否是空字符串 null和“”都返回true
     * @param str 判断的字符串
     * @return 是否有效
     */
    public static boolean isEmpty(String str){
        return str == null || "".equals(str);
    }

    /**
     *把 string array or list用给定的符号symbol连接成一个字符串
     *
     * @param list 需要处理的列表
     * @param symbo 连接的符号
     * @return 处理后 的字符串
     */
    public static String joinString(List<Object> list, String symbo){
        StringBuilder result = new StringBuilder();
        if (list != null){
            for (Object o :list){
                String temp =o.toString();
                if (temp.trim().length()>0){
                    result.append(temp).append(symbo);
                }
            }
            if (result.length()>1){
                result = new StringBuilder(result.substring(0,result.length() -1));
            }
        }
        return result.toString();
    }

    /**
     * 字符串省略截取
     * 字符串截取到指定长度SIZE+..的形式
     *
     * @param subject  需要处理的字符串
     * @param size 截取的长度
     * @return 处理后的字符串
     */
    public static String subStringOmit(String subject, int size){
        if(subject != null && subject.length() >size ){
            subject = subject.substring(0,size) + "...";
        }
        return subject;
    }

    /**
     *  隐藏邮件地址前缀
     *
     * @param email  EMail 邮箱地址 例如：ssss@qq.com
     * @return  返回已隐藏的前缀地址 ，如 *************@qq.com
     */
    public static String getHideEmailPrefix(String email){
        if (null != email){
            int index = email.lastIndexOf('@');
            if (index>0){
                email = repeat("*", index).concat(email.substring(index));
            }
        }
        return email;
    }

    /**
     * repeat - 通过原字符串 重复生成N此组成新的字符串
     * @param src  原字符串 例如：空格（" "),星号("*"),"浙江" 等...
     * @param num 重复生成次数
     * @return  返回咦生成的重复字符串
     */
    public static String repeat(String src, int num){
        StringBuilder s =new StringBuilder();
        for (int i = 0;i<num;i++){
            s.append(src);
        }
        return s.toString();
}

    /**
     * 截取字符串左侧的Num位截取到末尾
     * @param str1 处理的字符
     * @param num  开始位置
     * @return  截取后的字符串
     */
    public static String lTrim(String str1, int num){
        String tt = "";
        if (!isEmpty(str1) && str1.length()>=num){
            tt = str1.substring(num,str1.length());
        }
        return tt;
    }

    /**
     * 格局指定的字符把原字符分割成一个list
     * @param src  处理的字符串
     * @param pattern  分割字符串
     * @return  处理后的list
     */
    public static List<String> parseString2List(String src ,String pattern){
        List<String> list = new ArrayList<>();
        if (src !=null){
            String [] tt = src.split(pattern);
            list.addAll(Arrays.asList(tt));
        }
        return list;
    }

    /**
     * 格式化一个float
     * @param f
     * @param format  要格式化成的格式 such as ##.00 ，#.#
     * @return  格式化后的字符串
     */
    public static String formatDouble(double f,String format){
        DecimalFormat df = new DecimalFormat(format);
        return  df.format(f);
    }

    /**
     * 截取字符串左侧指定长度的字符串
     * @param input 输入字符串
     * @param count  截取长度
     * @return  截取字符串
     */
    public static String left(String  input, int count){
        if (isEmpty(input)){
            return  "";
        }
        count = Math.min(count,input.length());
        return input.substring(0,count);
    }

    /**
     * 删除所有的标点符号
     * @param str  处理的字符串
     * @return
     */
    public static String trimPunct(String str){
        if (isEmpty(str)){
            return "..";
        }
        return str.replaceAll("[\\pP\\p{Punct}]","");
    }

    /**
     * 获取字符串str在string中出现的次数
     * @param string 处理的字符串
     * @param str  子字符串
     * @return
     */
    public static int countSubStr(String string, String str){
        if ((str == null) || (str.length() ==0) || (string == null)|| (string.length() ==0)){
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(str, index)) !=-1){
            count++;
            index += str.length();
        }
        return  count;
    }
}
