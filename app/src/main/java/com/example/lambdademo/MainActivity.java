package com.example.lambdademo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.lambdademo.lambda.LambdaExampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_click).setOnClickListener(view->
        {
            Intent intent=new Intent(this, LambdaExampleActivity.class);
            startActivity(intent);
        });
    }
}
