package com.example.vsfe.Item5;

import java.util.ArrayList;
import java.util.List;

public class ChickenOrder {
    List<SourceType> orders;

    public ChickenOrder() {
        orders = new ArrayList<>();
    }

    public void addOrder(String s) {
        SourceType st = Enum.valueOf(SourceType.class, s);
        orders.add(st);
    }

    public void addOrder(SourceType st) {
        orders.add(st);
    }

    public List<SourceType> getOrders() {
        return this.orders;
    }
}
