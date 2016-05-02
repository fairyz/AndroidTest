package com.example.zhoup.testapplication;

import android.os.SystemClock;
import android.util.Log;

/**
 * Created by Zhoup on 2016/4/27.
 */
public class DemoThread2 extends Thread {
    @Override
    public void run() {
        super.run();
            for (int i = 1;i<50; i++) {
                Log.d("id", "id = " + i);
                SystemClock.sleep(300);
                if(isInterrupted()){
                    break;
                }
        }
    }
}
