package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint1.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200, 100, 400, 300, 180, 50, false, paint1);

        paint2.setStyle(Paint.Style.FILL);
        canvas.drawArc(200, 100, 400, 300, -20, -100, true, paint2);

        canvas.drawArc(250, 150, 350, 250, 20, 140, false, paint2);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
