package com.example.vsfe.Item5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class ChickenStoreFactoryTest {

    @Autowired
    private ChickenServiceFactory chickenServiceFactory;

    @Test
    void 치킨_주문_테스트() {
        // given
        SourceType mild = SourceType.MILD;
        SourceType curry = SourceType.CURRY;
        SourceType hot = SourceType.SPICY;
        SourceType soy = SourceType.SOY;
        SourceType fried = SourceType.NONE;

        // when
        ChickenService friedService = chickenServiceFactory.getService(fried);
        ChickenService curryService = chickenServiceFactory.getService(curry);
        ChickenService mildService = chickenServiceFactory.getService(mild);
        ChickenService hotService = chickenServiceFactory.getService(hot);
        ChickenService soyService = chickenServiceFactory.getService(soy);

        // that
        assertThat(friedService.getSourceType(), is(fried));
        assertThat(curryService.getSourceType(), is(curry));
        assertThat(hotService.getSourceType(), is(hot));
        assertThat(soyService.getSourceType(), is(soy));
        assertThat(mildService.getSourceType(), is(mild));

        // print
        friedService.makeChicken(0);
        curryService.makeChicken(0);
        hotService.makeChicken(0);
        soyService.makeChicken(0);
        mildService.makeChicken(0);
    }

    @Test
    void 치킨_수량_테스트() {
        // given
        SourceType mild = SourceType.MILD;
        SourceType curry = SourceType.CURRY;
        SourceType hot = SourceType.SPICY;
        SourceType soy = SourceType.SOY;
        SourceType fried = SourceType.NONE;

        // when
        ChickenService friedService = chickenServiceFactory.getService(fried);
        ChickenService curryService = chickenServiceFactory.getService(curry);
        ChickenService mildService = chickenServiceFactory.getService(mild);
        ChickenService hotService = chickenServiceFactory.getService(hot);
        ChickenService soyService = chickenServiceFactory.getService(soy);

        // that
        assertThat(friedService.deliverChicken(0), is(0));
        assertThat(friedService.deliverChicken(3), is(2));
        assertThat(curryService.deliverChicken(0), is(0));
        assertThat(curryService.deliverChicken(3), is(2));
        assertThat(mildService.deliverChicken(0), is(0));
        assertThat(mildService.deliverChicken(3), is(2));
        assertThat(hotService.deliverChicken(0), is(0));
        assertThat(hotService.deliverChicken(3), is(2));
        assertThat(soyService.deliverChicken(0), is(0));
        assertThat(soyService.deliverChicken(3), is(2));

    }
}
