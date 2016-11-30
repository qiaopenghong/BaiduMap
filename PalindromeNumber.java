package com.bwie.test.startmode;

import java.util.Scanner;

/**
 * 1.作用 回文数
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ch = s.toCharArray();
        for(int i = 0;i < ch.length;i++){
            char c = ch[i];
            if(ch[0] == ch[4] && ch[1] == ch[3]){
                System.out.print("此数是回文数:" + ch[i]);
            }
        }
    }

}
