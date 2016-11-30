package com.bwie.test.startmode;

/**
 * 1.作用 求1+2!+3!+...+20!的和
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public class ShuCount {
    public static void main(String[] args) {
        long sum=0;
        long fac=1;
        for(int i=1;i<=20;i++){
            fac=fac*i;//实现阶层
            System.out.println("求出每个阶层的值"+fac);
            sum+=fac;//每个阶层的值进行累加

        }
        System.out.println("得出总和"+sum);

    }
}
