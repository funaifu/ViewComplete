package com.fnf.complete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;

/**
 * Created by FuNaifu on 2019/4/22 下午6:15
 */
public class CanvasUseView extends View {
    private Context context;

    /**
     * 绘制颜色-drawColor, drawRGB, drawARGB-使用单一颜色填充整个画布
     */
    /**
     * 绘制基本形状
     * drawPoint, drawPoints, drawLine, drawLines, drawRect, drawRoundRect, drawOval, drawCircle, drawArc
     * 依次为 点、线、矩形、圆角矩形、椭圆、圆、圆弧
     */
    /**
     * 绘制图片
     *drawBitmap, drawPicture
     * 绘制位图和图片
     */
    /**
     * 绘制文本
     * drawText, drawPosText, drawTextOnPath
     * 依次为 绘制文字、绘制文字时指定每个文字位置、根据路径绘制文字
     */
    /**
     * 绘制路径
     * drawPath
     * 绘制路径，绘制贝塞尔曲线时也需要用到该函数
     */
    /**
     * translate是坐标系的移动，可以为图形绘制选择一个合适的坐标系。 请注意，位移是基于当前位置移动，而不是每次基于屏幕左上角的(0,0)点移动
     */

    public CanvasUseView(Context context) {
        this(context, null);
    }

    public CanvasUseView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CanvasUseView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    int w;
    int h;

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.w = w;
        this.h = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GRAY);
//        canvas.drawRGB(00, 01, 02);
        initPaint();
//        canvas.drawPoint(100,100,paint);
//        Rect r = new Rect(0,0,100,100);
//        canvas.drawRect(r,paint);
//        RectF rectF = new RectF(100,100,800,400);
//        canvas.drawRoundRect(rectF,300,300,paint);
//        RectF rectF = new RectF(20,20,800,400);
//        canvas.drawOval(rectF,paint);
        RectF rectF = new RectF(0, 0, w / 4, h / 4);

        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int widthPixels = displayMetrics.widthPixels;
        int heightPixels = displayMetrics.heightPixels;

        canvas.translate((w / 2), (h / 2));
//        for (int i = 0; i < 100; i++) {
//            canvas.scale(0.9f, 0.9f);
//            canvas.drawCircle(0, 0, w / 2, paint);
//        }

        canvas.drawCircle(0, 0, 400, paint);
//        canvas.drawCircle(0, 0, 360, paint);
        for (int i=0; i<=360; i+=10){               // 绘制圆形之间的连接线
            canvas.drawLine(0,0,0,-400,paint);
            canvas.rotate(10);
        }


//        canvas.drawArc(rectF, 0, 90, true, paint);
    }

    Paint paint;

    private void initPaint() {

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);

    }
}
