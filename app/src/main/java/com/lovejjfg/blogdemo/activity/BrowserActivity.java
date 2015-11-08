package com.lovejjfg.blogdemo.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.lovejjfg.blogdemo.R;
import com.lovejjfg.blogdemo.base.BaseSlideFinishActivity;
import com.lovejjfg.blogdemo.ui.TopSlidWebView;
import com.lovejjfg.blogdemo.ui.TopSlidWebViewLayout;

/**
 * Created by Administrator on 2015/11/8.
 */
public class BrowserActivity extends BaseSlideFinishActivity {

    private TextView mAppTitlle;
    private TopSlidWebView mTopSlidWebView;

    @Override
    public View initView(Bundle savedInstanceState) {

        View view = LayoutInflater.from(this).inflate(R.layout.activity_browser, null);
        TopSlidWebViewLayout mSlidWebViewLayout = (TopSlidWebViewLayout) view.findViewById(R.id.web_view_layout);
        mTopSlidWebView = mSlidWebViewLayout.getTopSlidWebView();
        Toolbar mToolBar = (Toolbar) view.findViewById(R.id.app_bar);
        setSupportActionBar(mToolBar);
        mAppTitlle = (TextView) view.findViewById(R.id.app_tittle);
        mAppTitlle.setText("ahaha");
        return view;//LayoutInflater.from(this).inflate(R.layout.activity_browser, null);
    }

    @Override
    protected void performViewClick(View v) {
    }

    @Override
    protected void init() {
        super.init();
        if (null != mTopSlidWebView) {
            mTopSlidWebView.loadUrl("http://dict.youdao.com/search?le=eng&q=slide&keyfrom=dict.top");
        }
    }
}