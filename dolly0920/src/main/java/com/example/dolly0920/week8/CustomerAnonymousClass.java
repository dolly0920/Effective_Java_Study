package com.example.dolly0920.week8;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class CustomerAnonymousClass {
  private ArrayList<String> orderList = new ArrayList<>();

  public boolean activate(CustomerAct customerAct) {
    Act act =
        new Act() {
          @Override
          public boolean order(String name) {
            if (orderList.contains(name)) {
              log.info("Same product exist");
              return false;
            }
            orderList.add(name);
            log.info("order success");
            return true;
          }

          @Override
          public boolean cancel(CancelType cancelType) {
            if (orderList.isEmpty()) {
              log.info("Shopping cart is empty");
              return false;
            }

            if (cancelType == CancelType.ALL) {
              orderList.clear();
              log.info("cart clear");
              return true;
            } else {
              orderList.remove(orderList.size() - 1);
              log.info("latest product removed");
              return true;
            }
          }

          @Override
          public boolean process(CustomerAct ca) {
            if (ca == CustomerAct.CANCELALL) {
              return cancel(CancelType.ALL);
            } else if (ca == CustomerAct.CANCELLATEST) {
              return cancel(CancelType.LATEST);
            } else {
              return order("new product test");
            }
          }
        };
    return act.process(customerAct);
  }
}
