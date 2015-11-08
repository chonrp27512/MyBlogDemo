package com.lovejjfg.blogdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lovejjfg.blogdemo.R;
import com.lovejjfg.blogdemo.utils.BaseUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_1:
                BaseUtil.startActivityOnspecifiedAnimation(this, SlidToFinishActivity.class);
                break;
        }
    }
}