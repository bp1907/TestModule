package com.wanma.webview;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.google.auto.service.AutoService;
import com.wanma.common.autoservice.IWebViewService;
import com.wanma.webview.utils.Constant;

/**
 * author: wanma
 * Date: 2020/8/11
 * Description
 */
@AutoService({IWebViewService.class})
public class WebViewServiceImpl implements IWebViewService {
    @Override
    public void startWebViewActivity(Context context, String url, String title, boolean isShowActionBar) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra(Constant.TITLE, title);
        intent.putExtra(Constant.URL, url);
        intent.putExtra(Constant.IS_SHOW_ACTION_BAR, isShowActionBar);
        context.startActivity(intent);
    }

    @Override
    public Fragment startWebViewFragment(String url) {
        return WebViewFragment.instanceFragment(url);
    }
}
