package com.example.vsfe.Item6;

public class NewCalenderDriver {
    public static void doTest() {
        for(int i = 0; i < 100000; i++) {
            NewCalender NC = new NewCalender();
            int year = NC.get(NC.YEAR);
            int mon = NC.get(NC.MONTH);
            int day = NC.get(NC.DAY_OF_MONTH);
            int hour = NC.get(NC.HOUR_OF_DAY);
            int min = NC.get(NC.MINUTE);
            int sec = NC.get(NC.SECOND);
        }
    }
}
