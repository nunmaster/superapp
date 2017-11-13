package com.example.miniapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MiniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini);
    }

    public void showString(String name) {
        System.out.println("Mini App : " + name);
    }
}
