package com.example.dolly0920.week12;

import java.util.*;

public class DatePrinter {

    public enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    public void apply(Set<Day> days) {
        System.out.printf("Day Printer : %s", Objects.requireNonNull(days));
    }

    public static void main(String[] args) {
        DatePrinter datePrinter = new DatePrinter();
        datePrinter.apply(EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY)); // EveryDay
        datePrinter.apply(EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY)); // WeekDay
        datePrinter.apply(EnumSet.of(Day.SATURDAY, Day.SUNDAY)); // Weekend
    }
}
