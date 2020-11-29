package com.zhp.frenchgameplatform.utility;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FunctionDelayer {
    public static void delayFunction(Runnable function, long time, TimeUnit unit) {
        Executors.newSingleThreadScheduledExecutor().schedule(function, time, unit);
    }
}
