package com.zhp.frenchgameplatform.async;

import android.app.Activity;
import com.google.gson.Gson;
import com.zhp.frenchgameplatform.animations.Pulse;
import com.zhp.frenchgameplatform.json.PulseArgs;
import com.zhp.frenchgameplatform.objects.Loader;
import org.json.JSONException;
import org.json.JSONObject;

public class LoaderCaller {
    public static void startLoading(Activity parent, int color) {
        try {
            AnimationHandler aH = AnimationHandler.builder()
                    .element(Loader.createLoader(parent, color, 1.65f))
                    .animation(new Pulse())
                    .args(new JSONObject(new Gson().toJson(
                            PulseArgs.builder()
                                    .time(10000)
                                    .scale(1.3f)
                                    .interval(500)
                                    .rmAfter(false)
                                    .build())))
                    .build();
            aH.execute();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
