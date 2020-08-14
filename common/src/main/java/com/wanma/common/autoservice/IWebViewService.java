package com.wanma.common.autoservice;

import android.content.Context;

import androidx.fragment.app.Fragment;

/**
 * author: wanma
 * Date: 2020/8/11
 * Description
 */
public interface IWebViewService {
    void startWebViewActivity(Context context, String url, String title, boolean isShowActionBar);

    Fragment startWebViewFragment(String url);
}
