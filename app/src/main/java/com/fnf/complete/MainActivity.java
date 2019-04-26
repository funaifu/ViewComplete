package com.fnf.complete;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 自定义View
 * 1，android自定义View-坐标系
 * 2，android自定义View-角，弧度
 * 3，android自定义View-颜色
 * 4，android自定义View-分类流程
 * 5，android自定义View-绘制基本图形
 * 6，android自定义View-画布操作
 * 7，android自定义View-文字图片
 * 8，android自定义View-path操作
 * 9，android自定义View-贝塞尔曲线
 * 10，android自定义View-pathMeasure
 * 11，android自定义View-matrix
 * 12，android自定义View-camera
 * 13，android自定义View-事件分发
 */

public class MainActivity extends AppCompatActivity {

    /**
     *getTop();       //获取子View左上角距父View顶部的距离
     *getLeft();      //获取子View左上角距父View左侧的距离
     *getBottom();    //获取子View右下角距父View顶部的距离
     *getRight();     //获取子View右下角距父View左侧的距离
     */
    /**
     * MotionEvent中 get 和 getRaw 的区别
     * event.getX();       //触摸点相对于其所在组件坐标系的坐标
     * event.getY();
     * event.getRawX();    //触摸点相对于屏幕默认坐标系的坐标
     * event.getRawY();
     */
    /**
     * 获取屏幕宽高
     * Display defaultDisplay = getWindowManager().getDefaultDisplay();
     * int width = defaultDisplay.getWidth();
     * int height = defaultDisplay.getHeight();
     */
    /**
     * getLocationInWindow 获取控件在当前窗口的位置
     * getLocationOnScreen 获取控件在整个屏幕的绝对坐标
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.tv_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityCanvasUse.class));
            }
        });
    }
}
