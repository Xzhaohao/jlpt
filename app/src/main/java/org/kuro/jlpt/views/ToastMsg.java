package org.kuro.jlpt.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.kuro.jlpt.R;

public class ToastMsg {

    public static void success(Context context, String message) {
        Toast toast = getToast(context, message, R.drawable.right);
        toast.show();
    }


    public static void error(Context context, String message) {
        Toast toast = getToast(context, message, R.drawable.wrong);
        toast.show();
    }


    @SuppressLint("InflateParams")
    private static Toast getToast(Context context, String message, Integer icon) {
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.TOP, 0, 200);

        View viewToast = LayoutInflater.from(context).inflate(R.layout.layout_toast, null);
        toast.setView(viewToast);

        TextView toastMessage = viewToast.findViewById(R.id.toast_message);
        toastMessage.setText(message);

        ImageView toastIcon = viewToast.findViewById(R.id.toast_icon);
        toastIcon.setImageResource(icon);

        return toast;
    }
}
