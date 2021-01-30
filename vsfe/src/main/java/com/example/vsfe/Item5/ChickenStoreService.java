package com.example.vsfe.Item5;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChickenStoreService {
    private final Map<SourceType, Integer> chickenCounter = new HashMap<>();
    private final ChickenService friedService;
    private final ChickenService sourcedService;
    private final ChickenService hotService;
    private final ChickenService curryService;
    private final ChickenService soyService;

    public ChickenStoreService(
            FriedImpl friedService,
            SourcedImpl sourcedService,
            HotImpl hotService,
            CurryImpl curryService,
            SoyImpl soyService
    ) {
        this.friedService = friedService;
        this.sourcedService = sourcedService;
        this.hotService = hotService;
        this.curryService = curryService;
        this.soyService = soyService;

        for(SourceType st : SourceType.values()) {
            chickenCounter.put(st, 0);
        }
    }

    public void makeChicken(ChickenOrder co) {
        List<SourceType> orderList = co.getOrders();
        for(SourceType st: orderList) {
            int count = chickenCounter.get(st);
            switch (st) {
                case NONE:
                    friedService.makeChicken(count);
                    chickenCounter.put(SourceType.NONE, count + 1);
                    break;
                case SOY:
                    soyService.makeChicken(count);
                    chickenCounter.put(SourceType.SOY, count + 1);
                    break;
                case MILD:
                    sourcedService.makeChicken(count);
                    chickenCounter.put(SourceType.MILD, count + 1);
                    break;
                case CURRY:
                    curryService.makeChicken(count);
                    chickenCounter.put(SourceType.CURRY, count + 1);
                    break;
                case SPICY:
                    hotService.makeChicken(count);
                    chickenCounter.put(SourceType.SPICY, count + 1);
                    break;
                default:
                    System.out.println("메뉴판에 없는걸 시키셨네...");
                    break;
            }
        }
    }

    public void deliverChicken(ChickenOrder co) {
        List<SourceType> orderList = co.getOrders();
        for(SourceType st: orderList) {
            int count = chickenCounter.get(st);
            switch (st) {
                case NONE:
                    count = friedService.deliverChicken(count);
                    chickenCounter.put(SourceType.NONE, count);
                    break;
                case SOY:
                    count = soyService.deliverChicken(count);
                    chickenCounter.put(SourceType.SOY, count);
                    break;
                case MILD:
                    count = sourcedService.deliverChicken(count);
                    chickenCounter.put(SourceType.MILD, count);
                    break;
                case CURRY:
                    count = curryService.deliverChicken(count);
                    chickenCounter.put(SourceType.CURRY, count);
                    break;
                case SPICY:
                    count = hotService.deliverChicken(count);
                    chickenCounter.put(SourceType.SPICY, count);
                    break;
                default:
                    System.out.println("메뉴판에 없는걸 시키셨네...");
                    break;
            }
        }
    }


}
