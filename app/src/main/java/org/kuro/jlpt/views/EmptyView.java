package org.kuro.jlpt.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.kuro.jlpt.R;

public class EmptyView extends LinearLayout {

    private ImageView icon;
    private TextView title;

    public EmptyView(@NonNull Context context) {
        super(context, null);
    }

    public EmptyView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public EmptyView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.layout_empty, this, true);
        setOrientation(VERTICAL);
        setGravity(Gravity.CENTER);

        icon = findViewById(R.id.empty_icon);
        title = findViewById(R.id.empty_text);
    }

    public void setEmptyIcon(@DrawableRes int iconRes) {
        icon.setImageResource(iconRes);
    }

    public void setTitle(String text) {
        if (TextUtils.isEmpty(text)) {
            title.setVisibility(GONE);
        } else {
            title.setText(text);
            title.setVisibility(VISIBLE);
        }
    }
}
