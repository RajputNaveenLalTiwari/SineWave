package com.example.workingonsinewave.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.example.workingonsinewave.R;
import com.example.workingonsinewave.views.Sinewave;

public class MainActivity extends AppCompatActivity
{
    private Context context;
    private int screenWidth,screenHeight;
    private RelativeLayout rootLayout;
    private Sinewave sinewave;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        context = MainActivity.this;
        screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        screenHeight = context.getResources().getDisplayMetrics().heightPixels;
        rootLayout = (RelativeLayout) findViewById(R.id.root);
        sinewave = new Sinewave(context,screenWidth,screenHeight);
        rootLayout.addView(sinewave);
    }
}
