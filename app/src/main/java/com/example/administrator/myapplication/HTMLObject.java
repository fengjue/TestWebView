package com.example.administrator.myapplication;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/12/18.
 */
public class HTMLObject {
    private Context context;
    public HTMLObject(Context context) {
    this.context = context;
    }
    @JavascriptInterface
    public void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
