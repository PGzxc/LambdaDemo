package com.example.lambdademo.toast;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by admin on 2017/12/13.
 */

public class ToastUtils {

    private static Toast toast;

    public static void showToast(Context context,String msg){
        if(toast==null){
            toast=Toast.makeText(context,msg,Toast.LENGTH_SHORT);
        }else {
            toast.setText(msg);
        }
        toast.show();
    }


}
