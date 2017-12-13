package com.example.lambdademo.lambda;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.lambdademo.R;
import com.example.lambdademo.toast.ToastUtils;

/**
 * Created by pgzxc on 2017/12/13.
 */

public class LambdaExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lambda_example);
        setListener();
    }

    private void setListener() {

        findViewById(R.id.btn_type_declaration).setOnClickListener(view-> ToastUtils.showToast(this,"1+2="+LambdaUtils.operate(1,2,LambdaUtils.addition)));
        findViewById(R.id.btn_type_no_declaration).setOnClickListener(view -> ToastUtils.showToast(this,"2-1="+LambdaUtils.operate(2,1,LambdaUtils.subtraction)));
        findViewById(R.id.btn_multi).setOnClickListener(view->ToastUtils.showToast(this,"1*2="+LambdaUtils.operate(1,2,LambdaUtils.multiplication)));
        findViewById(R.id.btn_div).setOnClickListener(view->ToastUtils.showToast(this,"3/1="+LambdaUtils.operate(3,1,LambdaUtils.division)+""));
        findViewById(R.id.btn_msg1).setOnClickListener(view->LambdaUtils.greetService1.sayMessage("msg1"));
        findViewById(R.id.btn_msg2).setOnClickListener(view->LambdaUtils.greetService2.sayMessage("msg2"));

    }
}
