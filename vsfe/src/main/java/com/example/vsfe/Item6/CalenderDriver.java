package com.example.vsfe.Item6;


import java.util.Calendar;

public class CalenderDriver {
    public static void doTest() {
        Calendar cd = Calendar.getInstance();

        for(int i = 0; i < 100000; i++) {
            int year = cd.get(Calendar.YEAR);
            int mon = cd.get(Calendar.MONTH);
            int day = cd.get(Calendar.DAY_OF_MONTH);
            int hour = cd.get(Calendar.HOUR_OF_DAY);
            int min = cd.get(Calendar.MINUTE);
            int sec = cd.get(Calendar.SECOND);
        }
    }
}
