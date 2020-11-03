package com.qfguo.study.day12;

import lombok.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/3
 **/
@Data
@Getter
@Setter
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private int stature;
    public Student(String name,int age,int stature){
        this.name = name;
        this.age = age;
        this.stature = stature;
    }
}