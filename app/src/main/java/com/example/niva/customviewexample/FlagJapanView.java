package com.example.niva.customviewexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Niva on 09/04/2016.
 */
public class FlagJapanView extends View {



    public FlagJapanView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.FILL);
        canvas.drawCircle(getWidth()/2, getHeight()/2, 50, p);
    }

}
