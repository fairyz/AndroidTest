package com.example.zhoup.testapplication;

import android.util.Log;

/**
 * Created by Zhoup on 2016/4/27.
 */
public class DemoThread implements Runnable {
    int id = 10;
    @Override
    public void run() {
        //synchronized (this) {
            Log.d("id","id = " + id);
            id--;
       // }
    }
}
