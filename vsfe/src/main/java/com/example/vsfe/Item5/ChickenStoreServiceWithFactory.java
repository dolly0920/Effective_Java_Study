package com.example.vsfe.Item5;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChickenStoreServiceWithFactory {
    private final ChickenServiceFactory chickenServiceFactory;
    private final Map<SourceType, Integer> chickenCounter = new HashMap<>();

    public ChickenStoreServiceWithFactory(ChickenServiceFactory chickenServiceFactory) {
        this.chickenServiceFactory = chickenServiceFactory;
        for(SourceType st : SourceType.values()) {
            chickenCounter.put(st, 0);
        }
    }

    public void makeChicken(ChickenOrder co) {
        List<SourceType> orderList = co.getOrders();
        for(SourceType st : orderList) {
            int count = chickenCounter.get(st);
            chickenServiceFactory.getService(st).makeChicken(count);
            chickenCounter.put(st, count + 1);
        }
    }

    public void deliverChicken(ChickenOrder co) {
        List<SourceType> orderList = co.getOrders();
        for(SourceType st : orderList) {
            int count = chickenCounter.get(st);
            count = chickenServiceFactory.getService(st).deliverChicken(count);
            chickenCounter.put(st, count);
        }
    }

    public Map<SourceType, Integer> getInstance() {
        return this.chickenCounter;
    }
}
