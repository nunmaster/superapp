package com.example.miniapp;

import android.content.Context;
import android.content.Intent;

import com.example.base.BaseActivity;

public class HomeObject extends BaseActivity{

    Context context;

    public HomeObject(Context context) {
        this.context = context;
    }

    public void startActivity() {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void showString() {
        System.out.println("Mini App");
    }
}

