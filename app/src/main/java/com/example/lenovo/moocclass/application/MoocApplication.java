package com.example.lenovo.moocclass.application;

import android.app.Application;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lenovo on 2018/2/3.
 * 程序入口   初始化  上下文
 */

public class MoocApplication extends Application{

    private static MoocApplication moocApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        moocApplication = this;
    }

    public static MoocApplication getInstance(){
        return moocApplication;
    }


}
