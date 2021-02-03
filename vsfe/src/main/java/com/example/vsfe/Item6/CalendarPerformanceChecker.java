package com.example.vsfe.Item6;

/*
* This class is a class that compares the performance of the method performing the same task by
* importing CalenderDriver.java using Calendar class and
* NewCalendarDriver.java using NewCalendar class newly defined using Calendar Abstract Class.
*
* Time elapsed with calender getInstance() method: 5131
* Time elapsed with NewCalender Class: 41483
* */


public class CalendarPerformanceChecker {
    final static CalendarPerformanceChecker CPC = new CalendarPerformanceChecker();

    interface CallCalender {
        public void call();
    }

    class CalenderCaller {
        public void callFunction(CallCalender c) {}
    }

    public static void main(String[] args) {
        long normalTime = 0, manualTime = 0;
        for(int i = 0; i < 10000; i++) {
            normalTime += CPC.checkPerformance(0);
            manualTime += CPC.checkPerformance(1);
        }

        System.out.println("Time elapsed with calender getInstance() method: " + normalTime);
        System.out.println("Time elapsed with NewCalender Class: " + manualTime);
    }

    public long checkPerformance(int flag) {
        CalenderCaller cc = new CalenderCaller();

        long beforeTime = System.currentTimeMillis();
        if(flag == 0) CalenderDriver.doTest();
        else NewCalenderDriver.doTest();
        long afterTime = System.currentTimeMillis();

        return afterTime - beforeTime;
    }
}
