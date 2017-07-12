package com.example.sharpcj.beziertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView = (MyView) findViewById(R.id.my_view);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_reset:
                mView.reset();
                break;
            case R.id.btn_skip:
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                break;
        }
    }


}
