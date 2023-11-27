package com.example.demoappinfinispan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.time.Instant;

@Builder
public class UtcInfo {

    @JsonProperty("utcTime")
    private Instant time;

}
