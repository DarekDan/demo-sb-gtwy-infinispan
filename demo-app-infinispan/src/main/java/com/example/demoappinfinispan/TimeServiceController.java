package com.example.demoappinfinispan;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Instant;

@RestController
@RequiredArgsConstructor
public class TimeServiceController {

    @GetMapping("/utc-time")
    public Mono<UtcInfo> getCurrentUtcTime() {
        return Mono.just(UtcInfo.builder()
                .time(Instant.now())
                .build());
    }

}

