package com.bwie.test.startmode;

/**
 * 1.作用 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public class JiShu {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str ="并且默认，即为public、 abstract类型";
        int chCount =0;
        int digitCount = 0;
        int blankCount =0;
        int chineseCount =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(('a'<= ch && ch <= 'z')||('A'<= ch && ch <= 'Z')){
                chCount++;
            }
            if('0'<=ch &&ch<= '9'){
                digitCount++;
            }
            if(ch==' '){
                blankCount++;
            }
            if(ch >= 0x0391 && ch <= 0xFFE5){ //中文unicode编码
                System.out.println(ch);
                chineseCount++;
            }
        }
        System.out.println("英文字符数："+chCount);
        System.out.println("数字字符数："+digitCount);
        System.out.println("空格数"+blankCount);
        System.out.println("中文字符数是："+chineseCount);
    }
}
