package com.bwie.test.javabase.com.bwie.dao;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.bwie.test.javabase.R;

public class HandlerOneActivity extends AppCompatActivity {
    private Handler myHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //显示进度条
            progress_bar.setProgress(msg.arg1);
            //重新把进程加入到进程队列中
            myHandler.post(runnable);
        }
    };
    private Runnable runnable = new Runnable() {
        int i = 0;
        @Override
        public void run() {
            i += 1;
            //首先获得一个消息结构
            Message msg = myHandler.obtainMessage();
            //给消息结构的arg1参数赋值
            msg.arg1 = i;
            //延时1s，java中的try+catch用来排错处理
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            //把消息发送到消息队列中
            myHandler.sendMessage(msg);
            if(i == 100)
                //把线程从线程队列中移除
                myHandler.removeCallbacks(runnable);

    }
    };
    private ProgressBar progress_bar = null;
    private Button start = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_one);
        progress_bar = (ProgressBar)findViewById(R.id.progress_bar);
        start = (Button)findViewById(R.id.start);
        start.setOnClickListener(new StartOnClickListenr());
    }
    private class StartOnClickListenr implements View.OnClickListener
    {
        public void onClick(View v) {
            // TODO Auto-generated method stub
            //让进度条显示出来
            progress_bar.setVisibility(View.VISIBLE);
            //将线程加入到handler的线程队列中
            myHandler.post(runnable);

        }
    }
}
