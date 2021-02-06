package com.example.sgkim94.item06;

import java.util.Arrays;
import java.util.List;

public class NotUseStaticInstance implements StaticInstance {
    @Override
    public List<Object> createInstance() {
        return Arrays.asList(new Object[0]);
    }
}
