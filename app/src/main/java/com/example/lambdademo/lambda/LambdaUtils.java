package com.example.lambdademo.lambda;

import android.util.Log;

/**
 * Created by admin on 2017/12/13.
 */

public class LambdaUtils {

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    public static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    // 类型声明
    static MathOperation addition = (int a, int b) -> a + b;
    // 不用类型声明
    static MathOperation subtraction = (a, b) -> a - b;
    // 大括号中的返回语句
    static MathOperation multiplication = (int a, int b) -> {
        return a * b;
    };
    // 没有大括号及返回语句
    static MathOperation division = (int a, int b) -> a / b;
    // 不用括号
    static GreetingService greetService1 = message ->
            Log.d("msg", message);
    // 用括号
    static GreetingService greetService2 = (message) ->
            Log.d("msg", message);
}
