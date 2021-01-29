package com.example.sgkim94.item06;

import java.util.List;

public class UseStaticInstance implements StaticInstance {
    @Override
    public List<Object> createInstance() {
        return List.of();
    }
}
