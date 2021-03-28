package com.example.dolly0920.week8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerAnonymousClassTest {

    private CustomerAnonymousClass customerAnonymousClass = new CustomerAnonymousClass();

    @Test
    public void shouldReturnTrueWithOrderNewThing() {
        assertEquals(true, customerAnonymousClass.activate(CustomerAct.ORDER));
    }

    @Test
    public void shouldReturnFalseWithOrderSameThing() {
        customerAnonymousClass.activate(CustomerAct.ORDER);
        assertEquals(false, customerAnonymousClass.activate(CustomerAct.ORDER));
    }

    @Test
    public void shouldReturnFalseWithCancelWhenNotExistCart() {
        assertEquals(false, customerAnonymousClass.activate(CustomerAct.CANCELALL));
        assertEquals(false, customerAnonymousClass.activate(CustomerAct.CANCELLATEST));
    }

    @Test
    public void shouldReturnTrueWithCancelWhenExistCart() {
        customerAnonymousClass.activate(CustomerAct.ORDER);
        assertEquals(true, customerAnonymousClass.activate(CustomerAct.CANCELLATEST));
        assertEquals(false, customerAnonymousClass.activate(CustomerAct.CANCELALL));
    }

}
