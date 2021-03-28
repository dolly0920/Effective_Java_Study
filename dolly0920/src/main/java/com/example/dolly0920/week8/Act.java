package com.example.dolly0920.week8;

public interface Act {
  boolean order(String name);
  boolean cancel(CancelType cancelType);
  boolean process(CustomerAct customerAct);
}
