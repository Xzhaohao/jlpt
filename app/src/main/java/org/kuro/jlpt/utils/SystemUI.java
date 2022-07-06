package org.kuro.jlpt.utils;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;

/**
 * 沉浸式实现
 */
public class SystemUI {

    public static void fixSystemUI(Activity mActivity, boolean darkMode) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }

        // 设置StatusBar模式
        if (darkMode) { // 黑色模式
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { // 设置statusBar和navigationBar为黑色
                    mActivity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                } else { // 设置statusBar为黑色
                    mActivity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                }
                mActivity.getWindow().setStatusBarColor(Color.TRANSPARENT);
            }
        } else {//白色模式
            int statusBarFlag = View.SYSTEM_UI_FLAG_VISIBLE;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                statusBarFlag = mActivity.getWindow().getDecorView().getSystemUiVisibility() & ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {// 设置statusBar为白色，navigationBar为灰色
                int navBarFlag = View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
                mActivity.getWindow().getDecorView().setSystemUiVisibility(navBarFlag | statusBarFlag);
            } else {
                mActivity.getWindow().getDecorView().setSystemUiVisibility(statusBarFlag);
            }
        }
    }
}
