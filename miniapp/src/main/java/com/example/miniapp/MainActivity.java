package com.example.miniapp;

import android.os.Bundle;

import com.example.base.BaseActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showString() {
        System.out.println("Mini App");
    }
}
