package com.yibh.yplan;

import android.app.Application;
import android.content.Context;

import com.elvishew.xlog.LogConfiguration;
import com.elvishew.xlog.LogLevel;
import com.elvishew.xlog.XLog;

/**
 * Created by Test on 2017/10/9.
 */

public class YApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        initLog();
    }

    private void initLog() {
        // 指定日志级别，低于该级别的日志将不会被打印，默认为 LogLevel
        LogConfiguration config = new LogConfiguration.Builder()
//                .logLevel(BuildConfig.DEBUG ? LogLevel.ALL : LogLevel.NONE) //默认ALL
                .tag("yibh.yplan")          // 指定 TAG，默认为 "X-LOG"
                .b()                         // 允许打印日志边框，默认禁止
                .build();
        XLog.init(config);
    }

    public static Context getmContext() {
        return mContext;
    }

}
