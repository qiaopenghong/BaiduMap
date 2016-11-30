package com.bwie.test.startmode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1.作用 遍历文件夹下的所有文件
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public class TraversalFile {
    /**
     * 读取某个文件夹下的所有文件
     */
    public static boolean readfile(String filepath) throws FileNotFoundException, IOException {
        try {

            File file = new File(filepath);
            if (!file.isDirectory()) {
                System.out.println("文件");
                System.out.println("path=" + file.getPath());
                System.out.println("absolutepath=" + file.getAbsolutePath());
                System.out.println("name=" + file.getName());

            } else if (file.isDirectory()) {
                System.out.println("文件夹");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        System.out.println("文件路径 = " + readfile.getPath());
                        System.out.println("所在文件夹 = "
                                + readfile.getAbsolutePath());
                        System.out.println("文件名 = " + readfile.getName());
                        FileWriter fw = null;
                        try {
                            fw = new FileWriter("f://aa.txt",true);
                            String c= readfile.getPath()+readfile.getName()+"\r\n";
                            fw.write(c);
                            fw.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                            System.out.println("写入失败");
                            System.exit(-1);
                        }
                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            readfile("f:/jar包");
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        System.out.println("ok");
    }

}
