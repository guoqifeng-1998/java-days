package com.qfguo.study.day14;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/2
 **/
public class Test01 {
    public static void main(String[] args){
                   String str = "1234567";
                    char[] c = str.toCharArray();
                    boolean b = true;
                  for(char c1:c){
                     if(!(c1>='0'&&c1<='9')){
                          b = false;
                           break;
                        }
                    }
                    System.out.println(b);

                   String regex = "\\d+";
                  System.out.println(str.matches(regex));
                }
 }

