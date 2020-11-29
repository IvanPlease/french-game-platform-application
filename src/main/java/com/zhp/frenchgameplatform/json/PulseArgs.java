package com.zhp.frenchgameplatform.json;

import lombok.Builder;

@Builder
public class PulseArgs {
    private final long time;
    private final double scale;
    private final long interval;
    private final boolean rmAfter;
}
