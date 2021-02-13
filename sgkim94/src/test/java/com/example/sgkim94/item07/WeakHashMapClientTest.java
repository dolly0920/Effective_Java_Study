package com.example.sgkim94.item07;

import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import static com.jayway.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WeakHashMapClientTest {

    @Test
    public void weakHashMap_test () {
        //given
        WeakHashMap<UniqueImageName, BigImage> map = new WeakHashMap<>();
        BigImage bigImageFirst = new BigImage("iamge");
        UniqueImageName imageNameFirst = new UniqueImageName("nameOfBigImage");

        BigImage bigImageSecond = new BigImage("second");
        UniqueImageName imageNameSecond = new UniqueImageName("nameOfBigImage");

        map.put(imageNameFirst, bigImageFirst);
        map.put(imageNameSecond, bigImageSecond);

        //when
        assertTrue(map.containsKey(imageNameFirst));
        assertTrue(map.containsKey(imageNameSecond));

        imageNameFirst = null;
        System.gc();

        //then
        await().atMost(10, TimeUnit.SECONDS)
                .until(() -> map.size() == 1);
        await().atMost(10, TimeUnit.SECONDS)
                .until(() -> map.containsKey(imageNameSecond));
    }
}
