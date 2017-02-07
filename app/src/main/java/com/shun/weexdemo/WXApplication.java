package com.shun.weexdemo;

import android.app.Application;

import com.shun.weexdemo.weex.ImageAdapter;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by yghysdr on 2017/2/7.
 */

public class WXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this, config);
    }
}
