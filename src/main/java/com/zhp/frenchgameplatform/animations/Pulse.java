package com.zhp.frenchgameplatform.animations;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

public class Pulse implements Animation {
    @Override
    public void run(View v, JSONObject o) throws JSONException {
        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(
                v,
                PropertyValuesHolder.ofFloat("scaleX", (float) o.getDouble("scale")),
                PropertyValuesHolder.ofFloat("scaleY", (float) o.getDouble("scale")));
        scaleDown.setDuration(o.getInt("interval"));
        scaleDown.setRepeatCount(o.getInt("time") / o.getInt("interval"));
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();
    }
}
