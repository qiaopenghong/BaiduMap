/**
 * 1.作用 实现Runnable接口
 * 2.作者 乔鹏宏
 * 3.日期 2016/12/1
 */
public class MyRunnable implements Runnable{
        private String name;
        public MyRunnable(String name) {
            this.name = name;
        }
        @Override
       public void run() {
        for(int i=0;i<10;i++){
            System.out.println("线程开始："+this.name+",i="+i);
        }
    }
}
