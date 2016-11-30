package com.bwie.test.startmode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/**
 * autour: 乔鹏宏
 * date: 2016/11/30 11:51
 * update: 2016/11/30
 */
//横竖屏切换时生命周期的回调
public class ScreenSwitch extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_switch);
        Log.e("HJJ", "Activity &&&& onCreate");
    }


    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.e("HJJ", "Activity &&&& onStart...");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("HJJ", "Activity &&&& onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.e("HJJ", "Activity &&&& onResume...");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("HJJ", "Activity &&&& onSaveInstanceState");
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.e("HJJ", "Activity &&&& onPause...");
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Log.e("HJJ", "Activity &&&& onStop...");
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.e("HJJ", "Activity &&&& onDestroy...");
    }

}
