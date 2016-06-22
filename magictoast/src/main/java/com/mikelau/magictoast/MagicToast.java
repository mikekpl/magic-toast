package com.mikelau.magictoast;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mike on 6/6/2016.
 */
public class MagicToast extends Toast {

    private static final int DEFAULT_TOAST_DURATION = LENGTH_LONG;

    @LayoutRes
    private static final int DEFAULT_LAYOUT_RESOURCE = R.layout.toast_main;

    public MagicToast(Context context) {
        super(context);
    }

    // Info Toast
    public static void showInfo(Context context, String msg) {
        showToastBase(context, R.drawable.shade_blue, msg);
    }

    public static void showInfo(Context context, String msg, int duration) {
        showToastBase(context, R.drawable.shade_blue, msg, duration);
    }

    // Error Toast
    public static void showError(Context context, String msg) {
        showToastBase(context, R.drawable.shade_red, msg);
    }

    public static void showError(Context context, String msg, int duration) {
        showToastBase(context, R.drawable.shade_red, msg, duration);
    }

    // Warning Toast
    public static void showWarning(Context context, String msg) {
        showToastBase(context, R.drawable.shade_yellow, msg);
    }

    public static void showWarning(Context context, String msg, int duration) {
        showToastBase(context, R.drawable.shade_yellow, msg, duration);
    }

    // Success Toast
    public static void showSuccess(Context context, String msg) {
        showToastBase(context, R.drawable.shade_green, msg);
    }

    public static void showSuccess(Context context, String msg, int duration) {
        showToastBase(context, R.drawable.shade_green, msg, duration);
    }

    // Dim Toast
    public static void showDim(Context context, String msg) {
        showToastBase(context, R.drawable.shade_gray, msg);
    }

    public static void showDim(Context context, String msg, int duration) {
        showToastBase(context, R.drawable.shade_gray, msg, duration);
    }

    // Base Toast
    public static void showToastBase(Context context, int backgroundResource, String msg) {
        new Builder(context)
                .withBackgroundResource(backgroundResource)
                .withMessage(msg)
                .build().show();
    }

    public static void showToastBase(Context context, int backgroundResource, String msg, int duration) {
        new Builder(context)
                .withBackgroundResource(backgroundResource)
                .withMessage(msg)
                .withDuration(duration)
                .build().show();
    }

    // Magic Toast Builder
    public static class Builder {
        private String mMessage;
        private Context mContext;
        private int mShowDuration;
        private int mBackgroundResource;

        public Builder(Context context) {
            mContext = context;
        }

        public Builder withMessage(String message) {
            this.mMessage = message;
            return this;
        }

        public Builder withDuration(int duration) {
            this.mShowDuration = duration;
            return this;
        }

        public Builder withBackgroundResource(@DrawableRes int backgroundResource) {
            this.mBackgroundResource = backgroundResource;
            return this;
        }

        public MagicToast build() {
            MagicToast toast = new MagicToast(mContext);

            View view;
            view = LayoutInflater.from(mContext).inflate(MagicToast.DEFAULT_LAYOUT_RESOURCE, null, false);

            if (mMessage != null) {
                TextView textView = (TextView) view.findViewById(R.id.text_view_toast_main);
                if (textView != null) {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(mMessage);
                }
            }

            view.setBackgroundResource(mBackgroundResource > 0 ? mBackgroundResource : R.drawable.shade_blue);
            toast.setView(view);
            toast.setDuration(mShowDuration >= 0 ? mShowDuration : DEFAULT_TOAST_DURATION);
            return toast;
        }
    }
}
