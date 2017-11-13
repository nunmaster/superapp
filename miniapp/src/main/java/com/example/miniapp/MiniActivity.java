package com.example.miniapp;

import android.os.Bundle;

import com.example.base.BaseActivity;

public class MiniActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini);
    }

    @Override
    public void showString(String name) {
        System.out.println("Mini App : " + name);
    }
}
