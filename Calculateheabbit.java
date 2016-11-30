package com.bwie.test.startmode;

/**
 * 1.作用 .古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的
 * 兔子总数为多少？
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public class Calculateheabbit {
    static int a=1;
    static int b=1;
    static int c=0;
    static int MONTH = 10; //第几个月
    static int TYPE = 1;  //一对生几对
    private int getCount(int month, int type){
        int sum = 0;
        if(month == 1 || month ==2){
            sum = 1;
        }else{
            sum = getCount(month - 1,1) + getCount(month - 2,1)*type;
        }
        if(month == MONTH){
            System.out.println("month="+month+" sum="+sum);
        }
        return sum;
    }



    public static void main(String[] args) {

       // (new Calculateheabbit()).getCount(MONTH, TYPE);
        Demo();
    }
    public static void Demo(){
        for (int i=1 ;i<=12;i++){
             a=b;
             b=c;
             c=a+b;
            System.out.println("第"+i+"个月"+"产了"+c+"对");
        }
    }
}
