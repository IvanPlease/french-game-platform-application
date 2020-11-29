package com.zhp.frenchgameplatform.utility;

import android.graphics.drawable.Drawable;
import top.defaults.drawabletoolbox.DrawableBuilder;

import static com.zhp.frenchgameplatform.utility.ColorManipulator.manipulateColors;

public class BackgroundDrawable {
    public static Drawable createGradientBackground(int color, int angle, int shape, float factor) {
        return new DrawableBuilder()
                .gradient()
                .shape(shape)
                .linearGradient()
                .angle(angle)
                .startColor(color)
                .endColor(manipulateColors(color, factor))
                .build();
    }
}
