package com.example.zhoup.testapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    DemoThread2 thread2;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
                  thread2.interrupt();

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DemoThread runnable = new DemoThread();
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//        Thread t3 = new Thread(runnable);
//        Thread t4 = new Thread(runnable);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
        thread2 = new DemoThread2();
        thread2.start();
        handler.obtainMessage();
        handler.sendEmptyMessageDelayed(0,2000);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
    public void sendMsg(String ... arg){
        Log.d("",arg[0]);
    }
}