package com.qfguo.study.day15;

/**
 * @ClassName Outer
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/3
 **/
 class Outer {
    private String name = "OuterClass";
    public void sayHi() {
        System.out.println("Hi, Outer.");
    }
    class Inner {
        public void sayHi() {
            // 内部类访问外部类
            Outer.this.sayHi();
            System.out.println(Outer.this.name);
            System.out.println("Hi, Inner.");
        }
    }
}
class InnerTest {
    public static void main(String[] args) {
        Outer.Inner inner =  new Outer().new Inner();
        inner.sayHi();
    }
}

