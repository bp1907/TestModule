package com.wanma.testmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wanma.base.autoservice.MyServiceLoader;
import com.wanma.common.autoservice.IWebViewService;
import com.wanma.webview.WebViewActivity;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.openW).setOnClickListener(v
                -> {
            IWebViewService webService = MyServiceLoader.load(IWebViewService.class);
            webService.startWebViewActivity(this, "https://www.baidu.com", "百度", false);
        });
    }
}