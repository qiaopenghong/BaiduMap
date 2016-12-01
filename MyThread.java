/**
 * 1.作用 继承Thread类
 * 2.作者 乔鹏宏
 * 3.日期 2016/12/1
 */
public class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        super();
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程开始：" + this.name + ",i=" + i);
        }
    }
}
