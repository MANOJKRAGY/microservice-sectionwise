package com.eazybytes.cards.audit;

import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAccessor;
import java.util.Optional;

@Component("utcDateTimeProvider")
public class UtcDateTimeProvider implements DateTimeProvider {

    @Override
    public Optional<TemporalAccessor> getNow() {
        return Optional.of(LocalDateTime.now(ZoneOffset.UTC));
    }
}

