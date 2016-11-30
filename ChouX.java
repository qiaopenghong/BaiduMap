package com.bwie.test.startmode;

/**
 * 1.作用 抽象类可以到多继承但必须实现里面的抽象方法
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
abstract class SanJiao {
    public static void main(String[] args) {
        Sleep s=new Sleep();
        s.study();
        Hidden h=new Hidden();
        h.study();
        Ruren();
    }
    abstract void study();
    public static void Ruren(){
        System.out.println("我在敲代码");
    }
}
class Sleep extends SanJiao{
    @Override
    void study() {
        System.out.println("我正在睡觉");
    }
}
class Hidden extends SanJiao{
    @Override
    void study() {
        System.out.println("我正在学习");
    }
}

