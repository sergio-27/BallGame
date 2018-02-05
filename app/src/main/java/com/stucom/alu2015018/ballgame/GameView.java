package com.stucom.alu2015018.ballgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by alu2015018 on 05/02/2018.
 */

public class GameView extends View {

    protected Paint paint;

    public GameView(Context context) {
        this(context, null, 0);
    }

    public GameView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GameView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private int x, y;

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.LTGRAY);
        int w = getWidth();
        int h = getHeight();
        canvas.translate(w / 2, h / 2);
        canvas.drawCircle(x, y, 20, paint);
    }
}
