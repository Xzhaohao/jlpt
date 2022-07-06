package org.kuro.jlpt.base;

import android.os.Bundle;

import org.kuro.jlpt.utils.SystemUI;

/**
 * UI 基类
 */
public class BaseUIActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SystemUI.fixSystemUI(this, true);
    }
}
