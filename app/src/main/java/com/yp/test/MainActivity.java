package com.yp.test;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.main_text);

        int width = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int height = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        textView.measure(width, height);
        height = textView.getMeasuredHeight();
        width = textView.getMeasuredWidth();
        Log.v(TAG, "getMeasuredWidth: " + width + " px" + " getMeasuredHeight: " + height + " px");
        Log.v(TAG, "getMeasuredWidth: " + px2dp(this, width) + " dp" + " getMeasuredHeight: " + px2dp(this, height) + " dp");

        int width2 = textView.getLayoutParams().width;
        int height2 = textView.getLayoutParams().height;
        Log.v(TAG, "getLayoutParams().width: " + width2 + " px" + " getLayoutParams().height: " + height2 + " px");
        Log.v(TAG, "getLayoutParams().width: " + px2dp(this, width2) + " dp" + " getLayoutParams().height: " + px2dp(this, height2) + " dp");

        int width3 = textView.getWidth();
        int height3 = textView.getHeight();
        Log.v(TAG, "getWidth(): " + width3 + " px" + " getHeight(): " + height3 + " px");
        Log.v(TAG, "getWidth(): " + px2dp(this, width3) + " dp" + " getHeight(): " + px2dp(this, height3) + " dp");

    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        int width4 = textView.getWidth();
        int height4 = textView.getHeight();

        Log.v(TAG, "getWidth(): " + px2dp(this, width4) + " getHeight(): " + px2dp(this, height4));
    }


    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


}
