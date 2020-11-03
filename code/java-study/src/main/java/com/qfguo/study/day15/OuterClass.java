package com.qfguo.study.day15;

/**
 * @ClassName OuterClass
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/3
 **/
 class OuterClass {
    public OuterClass() {
        System.out.println("OuterClass Init.");
    }
    protected static class InnerClass {
        public void sayHi() {
            System.out.println("Hi, InnerClass.");
        }
    }
}
class InnerClassTest {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.sayHi();
    }
}

