package com.zhp.frenchgameplatform.objects;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.zhp.frenchgameplatform.R;

import static com.zhp.frenchgameplatform.utility.BackgroundDrawable.createGradientBackground;
import static com.zhp.frenchgameplatform.utility.DimensionConverter.dpToPx;

public class Loader {
    public static View createLoader(Activity parent, int color, float factor) {
        LinearLayout layout = new LinearLayout(parent.getApplicationContext());
        RelativeLayout.LayoutParams backParams = new RelativeLayout.LayoutParams(dpToPx(65), dpToPx(65));
        backParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        layout.setLayoutParams(backParams);
        layout.setBackground(createGradientBackground(color, 135, GradientDrawable.OVAL, factor));
        layout.setWeightSum(1f);
        layout.setGravity(Gravity.CENTER);
        layout.setId(R.id.logoBackground);

        ImageView iView = new ImageView(parent.getApplicationContext());
        LayoutParams imageParams = new LayoutParams(0, LayoutParams.MATCH_PARENT, 0.8f);
        iView.setLayoutParams(imageParams);
        iView.setContentDescription("Platform logo");
        iView.setImageDrawable(parent.getDrawable(R.drawable.fgplogowob));

        layout.addView(iView);
        RelativeLayout rl = parent.findViewById(R.id.root);
        rl.addView(layout);

        return layout;
    }
}
