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
public class AustralianAboriginalFlag  extends View {

    public final String TAG = getClass().getSimpleName();

    private Paint paint;
    private float top, right, width, height;


    public AustralianAboriginalFlag(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        right = getPaddingRight();
        top = getPaddingTop();
        width = (getPaddingLeft() + getPaddingRight());
        height = (getPaddingTop() + getPaddingBottom());
    }



    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        right = getPaddingRight();
        top = getPaddingTop();
        width = w - (getPaddingLeft() + getPaddingRight());
        height = h - (getPaddingTop() + getPaddingBottom());
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float startX = 0, topY = 0, rightX = right + width, intervalY = height/2;

        paint.setColor(Color.BLACK);
        canvas.drawRect(startX, topY, rightX, intervalY, paint);

        paint.setColor(Color.RED);
        canvas.drawRect(startX, intervalY, rightX, height, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(getWidth()/2, getHeight()/2, 70, paint);

    }
}
