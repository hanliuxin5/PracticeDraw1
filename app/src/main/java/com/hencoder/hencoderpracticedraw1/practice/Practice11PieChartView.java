package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint4 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint5 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint6 = new Paint(Paint.ANTI_ALIAS_FLAG);

    Paint line = new Paint(Paint.ANTI_ALIAS_FLAG);

    Path path = new Path();

    Path path2 = new Path();

    {
        path.moveTo(50, 200);
        path.lineTo(200, 200);
        path.lineTo(350, 350);

        path2.moveTo(360, 360);
        path2.rLineTo(170, -(float) (170 * Math.sin(30 * Math.PI / 180) / Math.sin(60 * Math.PI / 180)));
        path2.rLineTo(100, 0);

        path2.moveTo(360, 360);
        path2.lineTo(540, 360);


        path2.moveTo(360, 360);
        path2.rLineTo(-150, (float) (170 * Math.sin(45 * Math.PI / 180) / Math.sin(45 * Math.PI / 180)));
        path2.rLineTo(-100, 0);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        line.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path, line);
        canvas.drawPath(path2, line);

        paint1.setColor(Color.RED);
        canvas.drawArc(200, 200, 500, 500, 180, 110, true, paint1);

        paint2.setColor(Color.YELLOW);
        canvas.drawArc(210, 210, 510, 510, -70, 65, true, paint2);

        paint3.setColor(Color.BLACK);
        canvas.drawArc(210, 210, 510, 510, 0, 17, true, paint3);
        paint4.setColor(Color.GRAY);
        canvas.drawArc(210, 210, 510, 510, 20, 5, true, paint4);
        paint5.setColor(Color.GREEN);
        canvas.drawArc(210, 210, 510, 510, 28, 43, true, paint5);
        paint6.setColor(Color.BLUE);
        canvas.drawArc(210, 210, 510, 510, 77, 103, true, paint6);

        canvas.drawText("haha", 0, 200, line);
        canvas.drawText("2222222222222", 540, 360, line);

    }
}
