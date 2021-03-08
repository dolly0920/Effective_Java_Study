package com.example.sypark9646.item18;

import java.util.List;
import java.util.TreeSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InstrumentedHashSetTest {

    @DisplayName("HashSet addAll Composition test")
    @Test
    void testCompositionInstrumentedHashSet() {
        InstrumentedHashSet<String> compositionInstrumentedHashSet = new InstrumentedHashSet<>(new TreeSet<>());
        compositionInstrumentedHashSet.addAll(List.of("1", "2", "3"));

        Assertions.assertEquals(3, compositionInstrumentedHashSet.size());
        Assertions.assertEquals(3, compositionInstrumentedHashSet.getAddCount());
    }
}
