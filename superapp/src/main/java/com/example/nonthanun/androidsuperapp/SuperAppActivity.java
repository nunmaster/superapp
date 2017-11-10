package com.example.nonthanun.androidsuperapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.miniapp.HomeObject;
import com.example.miniapp.MainActivity;

public class SuperAppActivity extends AppCompatActivity {

    private Button miniAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miniAppButton = (Button) findViewById(R.id.minibutton);
        miniAppButton.setOnClickListener(onClickListener);
    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MainActivity mainActivity = new MainActivity();
            mainActivity.showString();
        }
    };
}
