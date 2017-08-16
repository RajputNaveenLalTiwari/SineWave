package com.example.workingonsinewave.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by 2114 on 15-05-2017.
 */

public class Sinewave extends View
{
    private final int screenWidth,screenHeight;
    private final Paint paint;
    public Sinewave(Context context,int screenWidth,int screenHeight)
    {
        super(context);
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.parseColor("#FF0000"));
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5.0f);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#44FF00FF"));
        for (int i = 0; i < screenWidth; i++)
        {
            canvas.drawPoint(i, getSinWave(i,(screenHeight*20)/100,screenWidth), paint);
        }
    }


    private int getSinWave(int x, int halfY, int maxX)
    {
        double piDouble = 2 * Math.PI;
        double factor = piDouble / maxX;
        return (int) (Math.sin(x * factor) * (halfY)/4 + halfY);
    }
}
