package com.example.vsfe.Item5;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ChickenServiceFactory {
    private final Map<SourceType, ChickenService> chickenServices = new HashMap<>();

    public ChickenServiceFactory(List<ChickenService> chickenServices) {
        if(CollectionUtils.isEmpty(chickenServices)) {
            throw new IllegalStateException();
        }

        for (ChickenService cs: chickenServices) {
            this.chickenServices.put(cs.getSourceType(), cs);
        }
    }

    public ChickenService getService(SourceType st) {
        return chickenServices.get(st);
    }
}
