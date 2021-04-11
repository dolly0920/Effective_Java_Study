package com.example.dolly0920.week11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GenericContainer {

    private Map<Class<?>, Object> customContainer = new HashMap<>();

    public <T> void putMessage(Class<T> type, T instance) {
        customContainer.put(Objects.requireNonNull(type), instance);
    }

    public <T> T getMessage(Class<T> type) {
        return type.cast(customContainer.get(type));
    }
}
