package com.wanma.webview;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.wanma.webview.databinding.ActivityWebviewBinding;
import com.wanma.webview.utils.Constant;

/**
 * author: wanma
 * Date: 2020/8/11
 * Description
 */
public class WebViewActivity extends AppCompatActivity {

    ActivityWebviewBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_webview);
        mBinding.title.setText(getIntent().getStringExtra(Constant.TITLE));
        mBinding.actionBar.setVisibility(getIntent().getBooleanExtra(Constant.IS_SHOW_ACTION_BAR, true) ? View.VISIBLE : View.GONE);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        WebViewFragment fragment = WebViewFragment.instanceFragment(getIntent().getStringExtra(Constant.URL));
        fragmentTransaction.replace(R.id.fragment_webview, fragment).commit();
    }
}
