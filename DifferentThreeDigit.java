package com.bwie.test.startmode;

/**
 * 1.作用 有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public class DifferentThreeDigit {
    static int count=0;
    static int sum=0;
    private static int num;
    public static void main(String[] args) {
       for (int i=1;i<5;i++){
           for (int j=1;j<5;j++){
               for (int k=1;k<5;k++){
                  if(i!=j && j!=k && i!=k){
                      count++;
                      num = i*100+j*10+k;
                      System.out.println("第"+count+"个数："+ num);
                      sum+=num;
                  }
               }
           }
       }
        System.out.println("总共有"+count+"个");
        System.out.println("和为："+num);
    }
}
