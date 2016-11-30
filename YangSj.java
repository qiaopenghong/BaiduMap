package com.bwie.test.startmode;

/**
 * 1.作用 杨辉三角形
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public class YangSj {
    public static void main(String[] args) {
        int[][] fan = new int[10][];
        for(int i=0;i<=9;i++){
            fan[i]=new int[i+1];//指定每行的列数
        }
        yanghui(fan,10);
    }
    public static void yanghui(int a[][],int row){
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=a[i].length-1;j++){
                if(i==0||j==0||j==a[i].length-1)
                    a[i][j]=1;
                else
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=a[i].length-1;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
