package com.example.niva.customviewexample;

/**
 * Created by Niva on 09/04/2016.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Niva on 23/02/2016.
 */
public class FranceFlagView extends View {

    public final String TAG = getClass().getSimpleName();

    private Paint paint;
    private float top, right, width, height;

    private Path path;

    public FranceFlagView(Context context) {
        super(context);
        init(null, 0);
    }

    public FranceFlagView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public FranceFlagView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        right = getPaddingRight();
        top = getPaddingTop();
        width = w - (getPaddingLeft() + getPaddingRight());
        height = h - (getPaddingTop() + getPaddingBottom());
    }

    private void init(AttributeSet attrs, int defStyle) {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        path = new Path();
        right = getPaddingRight();
        top = getPaddingTop();
        width = (getPaddingLeft() + getPaddingRight());
        height = (getPaddingTop() + getPaddingBottom());
        //random = new Random(System.currentTimeMillis());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float startX = 0, topY = 0, bottom = top + height, intervalX = (right + width)/3;

        paint.setColor(Color.BLUE);
        canvas.drawRect(startX, topY, startX + intervalX, bottom, paint);

        paint.setColor(Color.WHITE);
        startX += intervalX;
        canvas.drawRect(startX, topY, startX + intervalX, bottom, paint);

        paint.setColor(Color.RED);
        startX += intervalX;
        canvas.drawRect(startX, topY, startX + intervalX, bottom, paint);


    }

}
