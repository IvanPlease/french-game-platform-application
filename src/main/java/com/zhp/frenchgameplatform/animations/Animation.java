package com.zhp.frenchgameplatform.animations;

import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

public interface Animation {
    void run(View v, JSONObject o) throws JSONException;
}
