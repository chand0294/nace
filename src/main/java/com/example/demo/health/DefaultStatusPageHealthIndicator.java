package com.example.demo.health;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static net.logstash.logback.argument.StructuredArguments.kv;

@Slf4j
@RequiredArgsConstructor
public class DefaultStatusPageHealthIndicator extends AbstractHealthIndicator {

    private final RestTemplate restTemplate;
    private final String statusPageUrl;

    @Override
    protected void doHealthCheck(Health.Builder builder) {
        try {
            restTemplate.getForEntity(URI.create(statusPageUrl), Object.class);
            builder.up();
        } catch (RestClientException e) {
            log.warn("action=healthCheckFailure", kv("statusPageUrl", statusPageUrl), e);
            String errorMessage = "Service is down: " + statusPageUrl;
            builder.withDetail("error", errorMessage);
            builder.down();
        }
    }
}
