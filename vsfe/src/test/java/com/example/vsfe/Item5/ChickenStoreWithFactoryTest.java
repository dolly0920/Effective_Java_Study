package com.example.vsfe.Item5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class ChickenStoreWithFactoryTest {

    @Autowired
    private ChickenServiceFactory chickenServiceFactory;

    @Test
    void 주문_테스트() {
        // given
        ChickenStoreServiceWithFactory chickenStoreServiceWithFactory = new ChickenStoreServiceWithFactory(chickenServiceFactory);
        SourceType mild = SourceType.MILD;
        SourceType curry = SourceType.CURRY;
        SourceType hot = SourceType.SPICY;
        SourceType soy = SourceType.SOY;
        SourceType fried = SourceType.NONE;

        // when
        ChickenOrder make = new ChickenOrder();
        make.addOrder("MILD");
        make.addOrder("MILD");
        make.addOrder("MILD");
        make.addOrder("NONE");
        make.addOrder("NONE");
        make.addOrder("NONE");
        make.addOrder("SOY");
        make.addOrder("SPICY");
        make.addOrder("SOY");
        make.addOrder("SPICY");
        make.addOrder("NONE");

        ChickenOrder deliver = new ChickenOrder();
        deliver.addOrder("NONE");
        deliver.addOrder("SOY");
        deliver.addOrder("SPICY");
        deliver.addOrder("SPICY");
        deliver.addOrder("MILD");
        deliver.addOrder("NONE");
        deliver.addOrder("NONE");
        deliver.addOrder("NONE");
        deliver.addOrder("NONE");

        // that
        chickenStoreServiceWithFactory.makeChicken(make);
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.NONE), is(4));
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.MILD), is(3));
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.SOY), is(2));
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.SPICY), is(2));
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.CURRY), is(0));

        chickenStoreServiceWithFactory.deliverChicken(deliver);
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.NONE), is(0));
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.MILD), is(2));
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.SOY), is(1));
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.SPICY), is(0));
        assertThat(chickenStoreServiceWithFactory.getInstance().get(SourceType.CURRY), is(0));
    }
}
