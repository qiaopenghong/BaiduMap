/**
 * 1.作用 开启线程
 * 2.作者 乔鹏宏
 * 3.日期 2016/12/1
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable("线程a");
        MyThread myThread=new MyThread("线程b");
        new Thread(myRunnable).start();
        new Thread(myThread).start();
    }

}
