package com.bwie.test.startmode;

/**
 * 1.作用 通过接口实现所有的抽象方法
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public interface Door{
    void demo(String name);
    void demo1();
    void demo2();
}
class Person implements Door{
    public static void main(String[] args) {
        Person p=new Person();
        p.demo1();
        p.demo("山西");
    }
    @Override
    public void demo(String name) {
        System.out.println(name);
    }

    @Override
    public void demo1() {
        System.out.println("1408b");
    }

    @Override
    public void demo2() {
        System.out.println("1408c");
    }
}