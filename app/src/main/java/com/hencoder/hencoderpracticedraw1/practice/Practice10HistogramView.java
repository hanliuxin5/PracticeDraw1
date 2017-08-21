package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Paint paint1 = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.WHITE);
        canvas.drawLine(100, 100, 100, 600, paint);
        canvas.drawLine(100, 600, 1000, 600, paint);

        paint1.setColor(Color.GREEN);
        canvas.drawRect(115, 490, 235, 600, paint1);
        canvas.drawRect(265, 480, 385, 600, paint1);
        canvas.drawRect(415, 300, 535, 600, paint1);
        canvas.drawRect(565, 400, 685, 600, paint1);
        canvas.drawRect(715, 450, 835, 600, paint1);
        canvas.drawRect(860, 270, 985, 600, paint1);

        canvas.drawText("111", 115, 615, paint);
        canvas.drawText("222", 265, 615, paint);
        canvas.drawText("333", 415, 615, paint);
        canvas.drawText("444", 565, 615, paint);
        canvas.drawText("555", 715, 615, paint);
        canvas.drawText("666", 860, 615, paint);

    }
}
