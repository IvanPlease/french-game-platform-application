package com.zhp.frenchgameplatform.utility;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;

import static com.zhp.frenchgameplatform.utility.BackgroundDrawable.createGradientBackground;

public class NotBarPreparation {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void setStatusBarGradiant(Activity activity, int color, int angle, float factor) {
        Window window = activity.getWindow();
        Drawable background = createGradientBackground(color, angle, GradientDrawable.RECTANGLE, factor);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.TRANSPARENT);
        window.setNavigationBarColor(Color.TRANSPARENT);
        window.setBackgroundDrawable(background);
    }
}
