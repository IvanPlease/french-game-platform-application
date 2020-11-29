package com.zhp.frenchgameplatform.async;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import com.zhp.frenchgameplatform.animations.Animation;
import lombok.Builder;
import org.json.JSONException;
import org.json.JSONObject;

@Builder
public class AnimationHandler extends AsyncTask<Void, Void, Void> {
    @SuppressLint("StaticFieldLeak")
    private final View element;
    private final Animation animation;
    private final JSONObject args;
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            Thread.sleep(args.getLong("time"));
        } catch (InterruptedException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    protected void onPreExecute() {
        try {
            animation.run(element, args);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        super.onPreExecute();
    }
    @Override
    protected void onPostExecute(Void unused) {
        try {
            if (args.getBoolean("rmAfter")) {
                removeAfter();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        super.onPostExecute(unused);
    }
    @Override
    protected void onCancelled() {
        try {
            if (args.getBoolean("rmAfter")) {
                removeAfter();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        super.onCancelled();
    }
    private void removeAfter() {
        ViewGroup parent = (ViewGroup) element.getParent();
        parent.removeView(element);
    }
}
